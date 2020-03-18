import java.util.ArrayList;

/**
 * ListeBateaux
 */
public class ListeBateaux {

    private ArrayList<Bateau> listeB;
    private static final int MAX = 10;

    public ListeBateaux() {
        listeB = new ArrayList<Bateau>(MAX);
    }

    public void ajouter(Bateau b) {
        if (listeB.size() < MAX) {
            listeB.add(b);
        }
        else {
            System.out.println("Erreur : liste pleine");
        }
    }

    public void lister() {
        for (Bateau bateau : listeB) {
            System.out.println(bateau.toString());
        }
    }

    public double rechercheLongueur(String nom) {
        boolean trouve = false;
        int i = 0;

        while ((!trouve) && (i < listeB.size())) {
            if (listeB.get(i).getNom().equals(nom)) {
                trouve = true;
            }
            else {
                i++;
            }
        }
        
        if (i == listeB.size()) {
            return listeB.get(i).getLongueur();
        }
        else {
            return 0;
        }
    }

    public void listerParPort(String port) {
        for (Bateau bateau : listeB) {
            if (bateau.getPortAttache().equals(port)) {
                System.out.println(bateau.toString());
            }
        }
    }
}