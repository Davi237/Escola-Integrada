package com.EscolaWeb.EscolaWeb.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String nomeUsuario;
    private String email;
    private String senha;
    private String tipoUsuario;
}
