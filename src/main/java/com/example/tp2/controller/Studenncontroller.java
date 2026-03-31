package com.example.tp2.controller;

import com.example.tp2.model.Etudiant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/web")
public class Studenncontroller {

    @GetMapping("/students")
    public String afficherStudents(Model model) {

        List<Etudiant> students = new ArrayList<>();

        students.add(new Etudiant("dabbb", "Ali", "DSI2", "14.5"));
        students.add(new Etudiant("boukhchim", "samia ", "DSI2", "15.2)"));

        model.addAttribute("students", students);

        return "student";
    }
}