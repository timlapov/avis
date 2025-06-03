package fr.humanbooster.fx.avis.business;

import java.time.LocalDate;

public class Joueur extends Utilisateur {

    private LocalDate dateDeNaissance ;

    public Joueur(String pseudo, String motDePasse, String email) {
        super(pseudo, motDePasse, email);
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    @Override
    public String toString() {
        return "Joueur [" +
                super.toString() +
                "]";
    }
}
