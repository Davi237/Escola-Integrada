package com.EscolaWeb.EscolaWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TelaInicialController {
       
    @GetMapping("/TelaInicial")
    public String TelaInicial() {
        // Retorne o template HTML (por exemplo, index.html) que contém os botões para Aluno, Professor e Coordenador
        return "TelaInicial"; // TelaInicial.html
    }
}