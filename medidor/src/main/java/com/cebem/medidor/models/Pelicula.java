package com.cebem.medidor.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Pelicula {
    @JsonProperty("Title")
    private String titulo;

    @JsonProperty("Year")
    private String anio;

    @JsonProperty("Rated")
    private String clasificacion;

    @JsonProperty("Released")
    private String lanzamiento;

    @JsonProperty("Runtime")
    private String duracion;

    @JsonProperty("Genre")
    private String genero;

    @JsonProperty("Director")
    private String director;

    @JsonProperty("Actors")
    private String actores;

    @JsonProperty("Plot")
    private String trama;

    @JsonProperty("Poster")
    private String poster;
}
