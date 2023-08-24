package com.mfcc.poke.data.model;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
public class PokemonField {
    private int id;
    private String name;
    private String description;
}
