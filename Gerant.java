/**
 * Gerant
 */
public class Gerant extends Employe {

    private static final int nb_H_G = 20;

    public Gerant(String nom, int age, int nbA) {
        super(nom, age, nbA);
    }

    public double calculSalaire() {
        return 5*nb_H_G*(20+this.getNbA()/2);
    }

    public String toString() {
        return super.toString() + ", " + nb_H_G;
    }

    public void afficher() {
        System.out.println("Gerant : " + this.toString());
    }
}