package com.mfcc.poke.data.controllers;

import com.mfcc.poke.data.client.PokemonClientApi;
import com.mfcc.poke.data.model.Pokemon;
import com.mfcc.poke.data.model.Result;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Slf4j
public class GenerateData {
    private Pokemon pokemon;
    private PokemonClientApi pokemonClientApi;

    public GenerateData (Pokemon pokemon, PokemonClientApi pokeClientApi) {
        this.pokemon = pokemon;
        this.pokemonClientApi = pokeClientApi;
    }

    public Optional<Result> getInformation() {
        if (pokemon != null) {
            Result.ResultBuilder result = Result.builder();
            result.id(pokemon.getId());
            result.name(pokemon.getName());
            result.height(pokemon.getHeight());
            result.weight(pokemon.getWeight());
            /*String description = pokemon.getDescriptions().stream()
                    .filter(descriptions -> "es".equals(descriptions.getLanguage()))
                    .findFirst().orElse(Pokemon.Descriptions.builder().description("Description not found").build())
                    .getDescription();
            result.description(Collections.singletonList(description));*/
            log.info(result.toString());
            return Optional.of(result.build());
        }
        return Optional.empty();
    }
}
