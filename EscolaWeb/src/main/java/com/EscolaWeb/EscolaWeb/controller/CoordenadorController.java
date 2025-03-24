package com.EscolaWeb.EscolaWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoordenadorController {

    @GetMapping("/Coordenador")
    public String showCoordenadorPage() {
        // Exibe a página com botões para cadastrar um novo aluno ou professor
        return "Coordenador"; // Coordenador.html
    }
}