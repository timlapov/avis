package fr.humanbooster.fx.avis.service.impl;

import fr.humanbooster.fx.avis.business.Editeur;
import fr.humanbooster.fx.avis.service.EditeurService;

import java.util.ArrayList;
import java.util.List;

public class EditeurServiceImpl implements EditeurService {

    private static List<Editeur> editeurs = new ArrayList<>();
    private static EditeurServiceImpl instance;

    private EditeurServiceImpl() {}

    public static EditeurServiceImpl getInstance() {
        if(instance == null) {
            instance = new EditeurServiceImpl();
        }
        return instance;
    }


    /**
     * Méthode qui ajoute un éditeur en utilisant le nom et le logo donnée en paramètre
     * @param nom
     * @param logo
     * @return L'éditeur ajouté
     */
    @Override
    public Editeur ajouterEditeur(String nom, String logo) {
        Editeur editeur = new Editeur(nom, logo);
        editeurs.add(editeur);
        return editeur;
    }

    /**
     *  Méthode qui récupère un éditeur par son id
     *
     * @param id
     * @return L'éditeur qui correspond à l'id en paramètre sinon null
     */
    @Override
    public Editeur recupererEditeur(Long id) {
        if(id == null) {
            throw new IllegalArgumentException("Id non valide");
        }
        for (Editeur editeur : editeurs) {
            if(editeur.getId().equals(id)) {
                return editeur;
            }
        }
        return null;
    }


    /**
     *  Méthode qui renvoie tous les éditeurs
     *
     * @return la liste complètes des éditeurs
     */
    @Override
    public List<Editeur> recupererEditeurs() {
        return editeurs;
    }

}
