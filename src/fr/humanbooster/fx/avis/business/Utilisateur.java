package fr.humanbooster.fx.avis.business;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Utilisateur extends Object {

    private Long id;
    private String pseudo;
    private String motDePasse;
    private String email;
    private static Long compteur = 0L;

    public Utilisateur() {
        this.id = compteur++;
    }

    public Utilisateur(String pseudo, String motDePasse, String email) {
        this();
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Utilisateur " +
                "{#id=" + id + ", pseudo=" + pseudo + ", email=" + email+ "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Utilisateur that = (Utilisateur) o;
        return Objects.equals(id, that.id) && Objects.equals(pseudo, that.pseudo) && Objects.equals(motDePasse, that.motDePasse) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pseudo, motDePasse, email);
    }

}
