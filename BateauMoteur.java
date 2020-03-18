/**
 * BateauMoteur
 */
public class BateauMoteur extends Bateau {

    private int puissance;
    private static final int prixMetre = 70;
    private static final int prixKW = 5;

    public BateauMoteur(String nom, double poids, String portAttache, double longueur, int puissance) {
        super(nom, poids, portAttache, longueur);
        this.puissance = puissance;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.puissance + " kW";
    }

    public double taxe() {
        return getLongueur()*BateauMoteur.prixMetre + getPuissance()*BateauMoteur.prixKW;
    }

    /**
     * @return the puissance
     */
    public int getPuissance() {
        return puissance;
    }
}