package com.devsuperior.dslist.services;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import com.devsuperior.dslist.dto.GameMinDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDTO> findAll() {
        List<Game> list = repository.findAll();
        List<GameMinDTO> dto = list.stream().map(Game -> new GameMinDTO(Game)).toList();
        return dto;
    }
}
