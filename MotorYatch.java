/**
 * MotorYatch
 */
public class MotorYatch extends BateauMoteur {

    private int nbEquipage;

    public MotorYatch(String nom, double poids, String portAttache, double longueur, int puissance, int nbEquipage) {
        super(nom, poids, portAttache, longueur, puissance);
        this.nbEquipage = nbEquipage;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + this.nbEquipage + ")";
    }

    public double taxe() {
        return super.taxe() + this.nbEquipage*20;
    }
}