package fr.humanbooster.fx.avis.business;

import java.time.LocalDate;

public class Jeu {

    private Long id;
    private String nom;
    private LocalDate dateDeSortie;
    private String Description;
    private boolean possedeImage;
    private static Long compteur = 0L;

    public Jeu() {
        this.id = compteur++;
    }

    public Jeu(String nom) {
        this();
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateDeSortie() {
        return dateDeSortie;
    }

    public void setDateDeSortie(LocalDate dateDeSortie) {
        this.dateDeSortie = dateDeSortie;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public boolean isPossedeImage() {
        return possedeImage;
    }

    public void setPossedeImage(boolean possedeImage) {
        this.possedeImage = possedeImage;
    }

    public static Long getCompteur() {
        return compteur;
    }

    public static void setCompteur(Long compteur) {
        Jeu.compteur = compteur;
    }

    public String toString() {
        return "Jeu " +
                "[#id=" + id + ", nom= " + nom + "]";
    }
}
