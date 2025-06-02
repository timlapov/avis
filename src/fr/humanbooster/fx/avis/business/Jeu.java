package fr.humanbooster.fx.avis.business;

public class Jeu {

    private Long id;
    private String nom;
    private String logo;
    private static Long compteur = 0L;

    public Jeu() {
        this.id = compteur++;
    }

    public Jeu(String nom, String logo) {
        this();
        this.nom = nom;
        this.logo = logo;
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
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
