package com.alura.literatura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosAutores (
        @JsonAlias("name") String nombre,
        @JsonAlias("birth_date")LocalDate fecha_nacimeinto,
        @JsonAlias("death_date") LocalDate fecha_muerte,
        @JsonAlias("nationality") String nacionalidad,
        @JsonAlias("notable_works") List<String> obrasDestacadas ,
        @JsonAlias("biography") String biografia
        ){

}
