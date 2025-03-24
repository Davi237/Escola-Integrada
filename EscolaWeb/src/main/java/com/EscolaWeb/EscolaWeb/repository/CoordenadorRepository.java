package com.EscolaWeb.EscolaWeb.repository;

import com.EscolaWeb.EscolaWeb.model.Coordenador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordenadorRepository extends JpaRepository<Coordenador, Integer> {
    // Adicione métodos de busca conforme necessário
}
