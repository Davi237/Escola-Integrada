package com.EscolaWeb.EscolaWeb.controller;

import com.EscolaWeb.EscolaWeb.model.Aluno;
import com.EscolaWeb.EscolaWeb.repository.AlunoRepository;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Professor")
public class ProfessorController {

    @Autowired
    private AlunoRepository alunoRepository;
    
    @GetMapping
    public String showProfessorPage(Model model) {
        // Exibe a página com formulário para cadastro de notas
        // Os campos devem ser: Nome do Aluno, Nota 1, Nota 2, Nota 3 e Disciplina (combo box)
        return "Professor";  // Professor.html
    }
    
    @PostMapping("/cadastrarNotas")
    public String cadastrarNotas(@RequestParam("nomeAluno") @NotEmpty String nomeAluno,
                                 @RequestParam("nota1") @NotEmpty String nota1,
                                 @RequestParam("nota2") @NotEmpty String nota2,
                                 @RequestParam("nota3") @NotEmpty String nota3,
                                 @RequestParam("disciplina") String disciplina,
                                 Model model) {
        // Procura o aluno pelo nome
        Aluno aluno = alunoRepository.findByNomeAluno(nomeAluno).orElse(null);
        
        if (aluno == null) {
            model.addAttribute("error", "Aluno não encontrado.");
            return "Professor";
        }
        
        // Aqui você deve implementar a lógica para salvar as notas.
        // Uma opção é criar uma entidade Nota (como mencionado anteriormente).
        // Exemplo: notaRepository.save(new Nota(aluno, disciplina, 1, Double.parseDouble(nota1), ...));
        // Para este exemplo, apenas retornamos uma mensagem de sucesso.
        
        model.addAttribute("message", "Notas cadastradas com sucesso para " + disciplina + ".");
        return "Professor"; // Professor.html
    }
}
