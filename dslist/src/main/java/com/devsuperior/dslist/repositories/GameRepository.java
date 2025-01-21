package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}

// Com isso, temos a disponição para o nosso
// componente fazer consulta com o banco
// inserir, atualizar, deletar, várias operações

// Componente do sistema
