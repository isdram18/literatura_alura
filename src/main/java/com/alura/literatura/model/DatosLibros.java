package com.alura.literatura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibros(
        @JsonAlias("title") String titulo,
        @JsonAlias("author") String autores,
        @JsonAlias("language") String lenguaje,
        @JsonAlias("birth_date") LocalDate fecha_nacimeinto,
        @JsonAlias("downloads") Integer descargas
) {

}
