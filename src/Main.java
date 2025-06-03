import fr.humanbooster.fx.avis.business.Joueur;
import fr.humanbooster.fx.avis.business.Moderateur;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Moderateur moderateur = new Moderateur("Anddy", "anddy", "anddy@gmail.com", "0707070707");
        Joueur joueur = new Joueur("bob", "bob", "bob@gmail.com");
        System.out.println(moderateur);
        System.out.println(joueur);
    }


}