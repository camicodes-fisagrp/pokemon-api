package com.mfcc.poke.data.service;

import com.mfcc.poke.data.model.Result;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface PokemonService {
    Optional<Result> getInfoPokemon(String name);
}

