package fr.humanbooster.fx.avis.business;

import java.util.Objects;

public class Editeur {

    private Long id;
    private String nom;
    private String Logo;
    private static Long compteur = 0L;

    public Editeur() {
        this.id = compteur++;
    }

    public Editeur(String nom, String Logo) {
        this();
        this.nom = nom;
        this.Logo = Logo;
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
        return Logo;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }

    @Override
    public String toString() {
        return "Editeur " +
                "[#id=" + id +
                ", nom= " + nom +
                ", Logo=" + Logo + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Editeur editeur = (Editeur) o;
        return Objects.equals(id, editeur.id) && Objects.equals(nom, editeur.nom) && Objects.equals(Logo, editeur.Logo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, Logo);
    }
}