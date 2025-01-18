package com.alura.literatura.principal;

import com.alura.literatura.service.ConsumoAPI;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private final String URL_BASE = "https://api.gutendex.com/books";
    private ConvierteDatos conversor = new ConvierteDatos();
    private List<DatosSerie> datosSeries = new ArrayList<>();
    private SerieRepository repositorio;
    private List<Libro> Libros;
    private Optional<Serie> serieBuscada;
}
