package com.cricinformer.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricinformer.entities.Match;
import com.cricinformer.services.MatchService;


@RestController
@RequestMapping("/match")
public class MatchController {
    
    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches() {
        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches() {
        return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
    }

    @GetMapping("/point_table")
    public ResponseEntity<?> getPointTable() {
        return new ResponseEntity<>(this.matchService.getPointTable(), HttpStatus.OK);
    }
    
}
