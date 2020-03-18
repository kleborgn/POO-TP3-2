/**
 * Bateau
 */
abstract class Bateau {

    private String nom;
    private double poids;
    private String portAttache;
    private double longueur;

    public Bateau(String nom, double poids, String portAttache, double longueur) {
        this.nom = nom;
        this.poids = poids;
        this.portAttache = portAttache;
        this.longueur = longueur;
    }

    @Override
    public String toString() {
        return this.nom + ", " + this.poids + ", " + this.portAttache + ", " + this.longueur;
    }

    abstract double taxe();

    /**
     * @return the longueur
     */
    public double getLongueur() {
        return longueur;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the poids
     */
    public double getPoids() {
        return poids;
    }

    /**
     * @return the portAttache
     */
    public String getPortAttache() {
        return portAttache;
    }
}