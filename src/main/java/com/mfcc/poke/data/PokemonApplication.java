package com.mfcc.poke.data;

import com.mfcc.poke.data.client.PokemonClientApi;
import com.mfcc.poke.data.controllers.GenerateData;
import com.mfcc.poke.data.model.Pokemon;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication

public class PokemonApplication {
    public static void main(String[] args) {
        SpringApplication.run(PokemonApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(PokemonClientApi pokemonClientApi) {
        return args -> {
            Pokemon pokemonInfo = pokemonClientApi.getPokemonInfo("blaziken");
            GenerateData data = new GenerateData(pokemonInfo, pokemonClientApi);
            data.getInformation();
        };
    }
}
