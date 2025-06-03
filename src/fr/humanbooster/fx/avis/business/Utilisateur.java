package fr.humanbooster.fx.avis.business;

import java.time.LocalDate;

public abstract class Utilisateur {

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
    
}
