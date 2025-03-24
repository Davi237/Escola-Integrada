package com.EscolaWeb.EscolaWeb.repository;

import com.EscolaWeb.EscolaWeb.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    Optional<Aluno> findByNomeAluno(String nomeAluno);
}

