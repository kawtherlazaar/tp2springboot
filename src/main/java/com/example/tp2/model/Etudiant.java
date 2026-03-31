package com.example.tp2.model;

public class Etudiant {
    private String nom ;
    private String prenom;
    private String groupe;
    private String moyenne;
    public Etudiant(){

    }
    public Etudiant(String nom,String prenom ,String groupe,String moyenne){
        this.nom=nom;
        this.prenom=prenom;
        this.groupe=groupe;
        this.moyenne=moyenne;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getGroupe() {
        return groupe;
    }

    public String getMoyenne() {
        return moyenne;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public void setMoyenne(String moyenne) {
        this.moyenne = moyenne;
    }
}
