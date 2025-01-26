package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.services.GameService;
import dto.GameMinDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = service.findAll();
        return result;
    }

}
