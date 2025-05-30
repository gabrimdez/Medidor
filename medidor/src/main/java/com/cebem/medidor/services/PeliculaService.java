package com.cebem.medidor.services;

import com.cebem.medidor.models.Pelicula;

import java.nio.charset.StandardCharsets;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriUtils;

@Service
public class PeliculaService {
    //private final String API_KEY = "47ffb4e6"; // Usa una de las que me diste

    public Pelicula buscarPelicula(String titulo) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://www.omdbapi.com/?apikey=" + "47ffb4e6" + "&t="
                + UriUtils.encode(titulo, StandardCharsets.UTF_8);
        return restTemplate.getForObject(url, Pelicula.class);
    }
}
