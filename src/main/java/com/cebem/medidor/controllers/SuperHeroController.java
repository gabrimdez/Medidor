package com.cebem.medidor.controllers;

import com.cebem.medidor.models.SuperheroCharacter;
import com.cebem.medidor.services.SuperheroService;

import org.springframework.ui.Model;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class SuperHeroController {

    private final SuperheroService superheroService;

    @GetMapping("/superhero")
    public String getSuperhero(Model model) {
        SuperheroCharacter character = superheroService.getSuperheroCharacter();
        if (character == null || character.getImage() == null || character.getImage().getUrl() == null) {
            // Intenta de nuevo con otro ID
            character = superheroService.getSuperheroCharacter();
        }
        model.addAttribute("hero", character);
        return "hero";
    }
}
