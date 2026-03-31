package com.example.tp2.controller;

import com.example.tp2.model.Etudiant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

    @GetMapping("/web/form")
    public String showForm(Model model) {
        model.addAttribute("etudiant", new Etudiant());
        return "form";
    }

    @PostMapping("/web/form")
    public String submitForm(@ModelAttribute Etudiant etudiant, Model model) {
        model.addAttribute("etudiant", etudiant);
        return "result";
    }
}