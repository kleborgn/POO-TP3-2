/**
 * Exo2
 */
public class Exo2 {

    public static void main(String[] args) {
        MotorYatch my1 = new MotorYatch("Yatch", 32, "Binic", 53, 150, 2);
        BateauMoteur bm1 = new BateauMoteur("BateauM", 32, "Binic", 53, 150);
        Voilier v1 = new Voilier("Dominique", 12, "Perros", 23, 250);

        ListeBateaux liste = new ListeBateaux();

        liste.ajouter(my1);
        liste.ajouter(bm1);
        liste.ajouter(v1);

        liste.lister();

        System.out.println(liste.rechercheLongueur("Yatch"));
        liste.listerParPort("Binic");
    }
}