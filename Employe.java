/**
 * Employe
 */
abstract class Employe implements Comparable<Employe> {

    private String nom;
    private int age;
    private int nbA;
    private static int nbEmploye = 0;
    private int numero;

    public Employe(String nom, int age, int nbA) {
        this.numero = nbEmploye;
        nbEmploye++;
        this.nom = nom;
        this.age = age;
        this.nbA = nbA;
    }

    abstract double calculSalaire();
    abstract void afficher();

    /**
     * @return the nbA
     */
    public int getNbA() {
        return nbA;
    }

    public String toString() {
        return numero + " : " + nom + ", " + age + "(" + nbA + ")";
    }

    @Override
    public int compareTo(Employe e) {
  //trions les employés selon leur age dans l'ordre croiddant
  //retroune un entier négative, zéro ou positive si l'age 
  //de cet employé est moins que, égale à ou supérieur à l'objet comparé avec
        return (int) (this.calculSalaire() - e.calculSalaire());
 }
}