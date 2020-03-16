/**
 * Ouvrier
 */
public class Ouvrier extends Employe {

    private static final int nb_H_O = 35;

    public Ouvrier(String nom, int age, int nbA) {
        super(nom, age, nbA);
    }

    public double calculSalaire() {
        return 4*nb_H_O*(10+this.getNbA()/2);
    }

    public void afficher() {
        System.out.println("Ouvrier : " + this.toString());
    }

    public String toString() {
        return super.toString() + ", " + nb_H_O;
    }
}