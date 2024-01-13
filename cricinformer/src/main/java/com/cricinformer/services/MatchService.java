package com.cricinformer.services;

import java.util.List;

import com.cricinformer.entities.Match;

public interface MatchService {
    List<Match> getAllMatches();
    List<Match> getLiveMatches();
    List<List<String>> getPointTable();
}
