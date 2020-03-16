/**
 * Exo1
 */
public class Exo1 {

    public static void main(String[] args) {
        Ouvrier o1 = new Ouvrier("Kilian", 19, 1);
        Ouvrier o2 = new Ouvrier("Gaston", 19, 3);
        Ouvrier o3 = new Ouvrier("Josette", 73, 58);

        Gerant g1 = new Gerant("Pierre", 43, 12);

        ListeEmployes liste = new ListeEmployes();

        liste.ajouter(o1);
        liste.ajouter(o2);
        liste.ajouter(o3);
        liste.ajouter(g1);

        liste.afficher();
        liste.trier();
        liste.afficher();
    }
}