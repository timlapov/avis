package fr.humanbooster.fx.avis.util;

import fr.humanbooster.fx.avis.business.Editeur;

import java.util.Comparator;

public class ComparateurDEditeurSurLogo implements Comparator<Editeur> {

    @Override
    public int compare(Editeur o1, Editeur o2) {
        return o1.getLogo().compareTo(o2.getLogo());
    }
}
