package com.EscolaWeb.EscolaWeb.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "Alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String nomeAluno;
    private String nomePai;
    private String nomeMae;
    private String cpfAluno;
    
    // Usando LocalDate para datas
    private LocalDate dataNasc;
    
    private String turma;
}
