import fr.humanbooster.fx.avis.business.Joueur;
import fr.humanbooster.fx.avis.business.Moderateur;
import fr.humanbooster.fx.avis.business.Utilisateur;

import java.time.LocalDate;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Utilisateur> utilisateurs = new ArrayList<>();

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

    }

}