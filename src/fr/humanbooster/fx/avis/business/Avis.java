package fr.humanbooster.fx.avis.business;

import java.time.LocalDateTime;

public class Avis {
    private Long id;
    private String contenu;
    private Float note;
    private LocalDateTime dateDeCreation;
    private static Long compteur = 0L;

    public Avis() {
        this.id = compteur++;
        this.dateDeCreation = LocalDateTime.now();
    }
    public Avis(String contenu) {
        this();
        this.contenu = contenu;
    }

    private Avis(Float note) {
        this();
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Float getNote() {
        return note;
    }

    public void setNote(Float note) {
        this.note = note;
    }

    public LocalDateTime getDateDeCreation() {
        return dateDeCreation;
    }

    public void setDateDeCreation(LocalDateTime dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }

    @Override
    public String toString() {
        return "Avis{" +
                "id=" + id +
                ", contenu='" + contenu + '\'' +
                ", note=" + note +
                ", dateDeCreation=" + dateDeCreation +
                '}';
    }
}
