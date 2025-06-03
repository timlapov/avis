package fr.humanbooster.fx.avis.business;


import java.util.Objects;

public class Plateforme implements Comparable<Plateforme> {
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


    /**
     * On montre à Java comment comparer 2 objets éduteyrs : l'objet this et l'objet éditeur
     * @param o the object to be compared.
     * On décide de comparer les éditeurs sur leur nom
     * @return
     */
    @Override
    public int compareTo(Plateforme o) {
        return getNom().compareTo(o.getNom());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Plateforme that = (Plateforme) o;
        return Objects.equals(id, that.id) && Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }

    @Override
    public String toString() {
        return "Plateforme{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }

}
