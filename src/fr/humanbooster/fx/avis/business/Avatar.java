package fr.humanbooster.fx.avis.business;

public class Avatar {
    private Long id;
    private String nom;
    private static Long compteur = 0L;

    public Avatar() {
        this.id = ++compteur;
    }

    public Avatar(String nom) {
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

    @Override
    public String toString() {
        return "Avatar{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
