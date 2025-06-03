package fr.humanbooster.fx.avis.business;

public class Moderateur extends Utilisateur {

    private String numeroDeTelephone;

    public Moderateur(String pseudo, String motDePasse, String email, String numeroDeTelephone) {
        super(pseudo, motDePasse, email);
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    @Override
    public String toString() {
        return "Moderateur [id=" + getId() + ", pseudo=" + getPseudo() + ", email=" + getEmail()
                + ", numeroDeTelephone=" + numeroDeTelephone + "]";
    }
}
