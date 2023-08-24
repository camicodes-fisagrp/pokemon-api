package com.mfcc.poke.data.service.impl;
import com.mfcc.poke.data.client.PokemonClientApi;
import com.mfcc.poke.data.controllers.GenerateData;
import com.mfcc.poke.data.model.Pokemon;
import com.mfcc.poke.data.model.Result;
import com.mfcc.poke.data.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class PokemonServiceImpl implements PokemonService{
    @Autowired
    private PokemonClientApi pokemonClientApi;

    @Override
    public Optional<Result> getInfoPokemon(String name){
        Pokemon pokemonInfo = pokemonClientApi.getPokemonInfo(name);
        GenerateData generateData = new GenerateData(pokemonInfo,pokemonClientApi);
        return generateData.getInformation();
    }
}
