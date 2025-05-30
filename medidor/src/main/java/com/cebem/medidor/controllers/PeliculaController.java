package com.cebem.medidor.controllers;

import com.cebem.medidor.models.Pelicula;
import com.cebem.medidor.services.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/peliculas")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping("")
    public String formularioBusqueda() {
        return "pelicula"; // nombre del HTML que vamos a crear
    }

    @PostMapping("/buscar")
    public String buscar(@RequestParam("titulo") String titulo, Model model) {
        Pelicula pelicula = peliculaService.buscarPelicula(titulo);
        model.addAttribute("pelicula", pelicula);
        return "pelicula";
    }
}
