package fr.humanbooster.fx.avis.business;

public class Plateforme {
    private Long id;
    private String nom;
    private static Long compteur = 0L;

// Default constructor
    public Plateforme() {
        this.id = ++compteur;
    }

    public Plateforme(String nom) {
        this();
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Plateforme{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }

}
