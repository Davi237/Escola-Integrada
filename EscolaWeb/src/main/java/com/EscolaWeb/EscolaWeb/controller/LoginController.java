package com.EscolaWeb.EscolaWeb.controller;

import com.EscolaWeb.EscolaWeb.model.Usuario;
import com.EscolaWeb.EscolaWeb.repository.UsuarioRepository;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class LoginController {

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    // Exibe o formulário de login e recebe o tipo de usuário para redirecionamento
    @GetMapping("/Login")
    public String showLogin(@RequestParam("tipo") String tipo, Model model) {
        model.addAttribute("tipo", tipo);
        return "Login";  // Login.html
    }
    
    // Processa o login
    @PostMapping("/Login")
    public String processLogin(@RequestParam("usuario") @NotEmpty String usuario,
                               @RequestParam("senha") @NotEmpty String senha,
                               @RequestParam("tipo") String tipo,
                               Model model) {
        Optional<Usuario> optionalUsuario = usuarioRepository.findByNomeUsuario(usuario);
        
        if(optionalUsuario.isPresent()) {
            Usuario u = optionalUsuario.get();
            if(u.getSenha().equals(senha) && u.getTipoUsuario().equalsIgnoreCase(tipo)) {
                // Após autenticar, redireciona para a tela correspondente
                if(tipo.equalsIgnoreCase("Aluno")) {
                    return "redirect:/Aluno";
                } else if(tipo.equalsIgnoreCase("Professor")) {
                    return "redirect:/Professor";
                } else if(tipo.equalsIgnoreCase("Coordenador")) {
                    return "redirect:/Coordenador";
                }
            }
        }
        
        model.addAttribute("error", "Usuário ou senha inválidos");
        model.addAttribute("tipo", tipo);
        return "Login"; // Login.html
    }
}