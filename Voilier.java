/**
 * Voilier
 */
public class Voilier extends Bateau {

    private double surfaceVoile;
    private static final int prixMetre = 50;

    public Voilier(String nom, double poids, String portAttache, double longueur, double surfaceVoile) {
        super(nom, poids, portAttache, longueur);
        this.surfaceVoile = surfaceVoile;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.surfaceVoile + " m2";
    }

    public double taxe() {
        return getLongueur()*Voilier.prixMetre;
    }

    /**
     * @return the surfaceVoile
     */
    public double getSurfaceVoile() {
        return surfaceVoile;
    }
}