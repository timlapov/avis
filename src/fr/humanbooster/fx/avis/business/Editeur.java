package fr.humanbooster.fx.avis.business;

public class Editeur {

    private Long id;
    private String nom;
    private static Long compteur = 0L;

    public Editeur() {
        this.id = compteur++;
    }

    public Editeur(String nom) {
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

    public String toString() {
        return "Editeur " +
                "[id=" + id + ", nom=" + nom + "]";
    }
}