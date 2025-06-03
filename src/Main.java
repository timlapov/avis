import fr.humanbooster.fx.avis.business.*;
import fr.humanbooster.fx.avis.service.EditeurService;
import fr.humanbooster.fx.avis.service.impl.EditeurServiceImpl;
import fr.humanbooster.fx.avis.util.ComparateurDEditeurSurLogo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static EditeurService editeurService = EditeurServiceImpl.getInstance();

    private static void ajouterEditeurs() {
        editeurService.ajouterEditeur("Activision", "activision.com");
        editeurService.ajouterEditeur("Amazon Games","amazongames.com");
        editeurService.ajouterEditeur("Ankama", "ankama.com");
        editeurService.ajouterEditeur("Bandai Namco", "bandai.co.jp");
        editeurService.ajouterEditeur("Bethesda", "bethesda.net");
        editeurService.ajouterEditeur("BioWare", "bioware.com");
        editeurService.ajouterEditeur("Blizzard", "blizzard.com");
        editeurService.ajouterEditeur("Capcom", "capcom.com");
        editeurService.ajouterEditeur("CCP", "ccpgames.com");
        editeurService.ajouterEditeur("CD Projekt Red", "cdprojekt.com");
        editeurService.ajouterEditeur("Davilex", "davilex.nl");
        editeurService.ajouterEditeur("Digital Extreme", "digitalextremes.com");
        editeurService.ajouterEditeur("Electronic Arts", "ea.com");
        editeurService.ajouterEditeur("Epic Games", "epicgames.com");
        editeurService.ajouterEditeur("FromSoftware", "fromsoftware.jp");
        editeurService.ajouterEditeur("Hazelight Studios", "hazelight.se");
        editeurService.ajouterEditeur("idSoftware", "idsoftware.com");
        editeurService.ajouterEditeur("Microsoft", "microsoft.com");
        editeurService.ajouterEditeur("Mobius Digital", "mobiusdigitalgames.com");
        editeurService.ajouterEditeur("MonolithSoftware", "monolithsoft.co.jp");
        editeurService.ajouterEditeur("Naughty Dog", "naughtydog.com");
        editeurService.ajouterEditeur("Nintendo", "nintendo.com");
        editeurService.ajouterEditeur("Riot Games", "riotgames.com");
        editeurService.ajouterEditeur("Rockstar", "rockstar.com");
        editeurService.ajouterEditeur("Sega", "sega.com");
        editeurService.ajouterEditeur("Square Enix", "squareenix.com");
        editeurService.ajouterEditeur("Tencent", "tencentgames.com");
        editeurService.ajouterEditeur("Ubisoft", "ubisoft.com");
        editeurService.ajouterEditeur("Ultra Software", null);
        editeurService.ajouterEditeur("Valve", "valvesoftware.com");
        editeurService.ajouterEditeur("Wildcard", "wildcardmobile.com");
    }

    public static void main(String[] args) {

        /*List<Utilisateur> utilisateurs = new ArrayList<>();
        Moderateur moderateur = new Moderateur("Anddy", "", "andy@gmail.com", "0207070707");
        System.out.println(moderateur);
        utilisateurs.add(moderateur);

        Joueur joueur1 = new Joueur("a", "", "", LocalDate.of(2000, 1, 1));
        Joueur joueur2 = new Joueur("a", "", "", LocalDate.of(2000, 1, 1));
        System.out.println(joueur1);
        System.out.println(joueur2);
        System.out.println(joueur1.equals(joueur2));
        utilisateurs.add(joueur1);
        utilisateurs.add(joueur2);

        for(Utilisateur utilisateur : utilisateurs) {
            if (utilisateur instanceof Moderateur) {
                System.out.println(((Moderateur) utilisateur).getNumeroDeTelephone() );
            } else if (utilisateur instanceof Joueur) {
                System.out.println(((Joueur) utilisateur).getDateDeNaissance());
            } else {
                System.out.println(utilisateur);
            }
        }

        //Il est préférable de déclarer une collection par son interface
        //pour pouvoir choisir après le new le type d'implémentation
        List<Editeur> editeurs = new ArrayList<>();
        Editeur editeur1 = new Editeur("Capcom", "capcom.jp");
        Editeur editeur2 = new Editeur("Ubisoft", "ubisoft.jp");
        Editeur editeur3 = new Editeur("Riot", "riot.jp");

        editeurs.add(editeur1);
        editeurs.add(editeur2);
        editeurs.add(editeur3);

        Collections.sort(editeurs, new ComparateurDEditeurSurLogo());
        System.out.println(editeurs);

        EditeurServiceImpl editeurService = new EditeurServiceImpl();
        editeurService.ajouterEditeur("Capcom", "capcom.jp");
        editeurService.ajouterEditeur("Ubisoft", "ubisoft.jp");
        editeurService.ajouterEditeur("Riot", "riot.jp");
        System.out.println(editeurService.recupererEditeurs());
        System.out.println(editeurService.recupererEditeur(4L));*/

        /*
        List<Plateforme> plateformes = new ArrayList<>();
        Plateforme plateforme1 = new Plateforme("Playstation");
        Plateforme plateforme2 = new Plateforme("NintendoSwitch");
        Plateforme plateforme3 = new Plateforme("Xbox");
        plateformes.add(plateforme1);
        plateformes.add(plateforme2);
        plateformes.add(plateforme3);

        Collections.sort(plateformes);

        System.out.println(plateformes);*/

        ajouterEditeurs();
        System.out.println(editeurService.recupererEditeurs());

    }


}