package com.EscolaWeb.EscolaWeb.controller;

import com.EscolaWeb.EscolaWeb.model.Aluno;
import com.EscolaWeb.EscolaWeb.model.Professor;
import com.EscolaWeb.EscolaWeb.repository.AlunoRepository;
import com.EscolaWeb.EscolaWeb.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CadastroController {

    @Autowired
    private AlunoRepository alunoRepository;
    
    @Autowired
    private ProfessorRepository professorRepository;
    
    @PostMapping("/Coordenador/salvarAluno")
    public String salvarAluno(@ModelAttribute Aluno aluno, Model model) {
        alunoRepository.save(aluno);
        model.addAttribute("message", "Aluno cadastrado com sucesso!");
        return "CadastroAluno";
    }
    
    @PostMapping("/Coordenador/salvarProfessor")
    public String salvarProfessor(@ModelAttribute Professor professor, Model model) {
        professorRepository.save(professor);
        model.addAttribute("message", "Professor cadastrado com sucesso!");
        return "CadastroProfessor";
    }
}