package com.example.tp2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/web")
public class WebController {

    @GetMapping("/hello")
    public String hello(
            @RequestParam(name = "nom", defaultValue = "Etudiant") String nom,
            Model model) {

        model.addAttribute("nom", nom);
        return "hello"; // va chercher hello.html dans templates
    }
}