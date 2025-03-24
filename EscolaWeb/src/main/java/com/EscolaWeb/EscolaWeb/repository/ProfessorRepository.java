package com.EscolaWeb.EscolaWeb.repository;

import com.EscolaWeb.EscolaWeb.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
    // Adicione métodos de busca conforme necessário
}
