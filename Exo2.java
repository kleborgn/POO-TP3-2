/**
 * Exo2
 */
public class Exo2 {

    public static void main(String[] args) {
        MotorYatch my1 = new MotorYatch("Yatch", 32, "Binic", 53, 150, 2);
        BateauMoteur bm1 = new BateauMoteur("BateauM", 32, "Binic", 53, 150);
        System.out.println(my1.taxe());
        System.out.println(bm1.taxe());
    }
}