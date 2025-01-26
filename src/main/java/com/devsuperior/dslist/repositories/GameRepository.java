package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import dto.GameMinDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
