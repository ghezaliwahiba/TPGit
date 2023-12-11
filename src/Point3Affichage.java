import java.sql.SQLOutput;

public class Point3Affichage {
    public static void main(String[] args) {
        String firstName="Wahiba";
        String lastName="GHEZALI RAMDANI";
        int age=38;
        double weight=50.1;
        System.out.println("Je m'appelle "+firstName+" "+lastName+", j'ai "+age+" ans, je pèse "+weight+"Kg");
        System.out.printf("je m'apelle %s %s, j'ai %d et je pese %f kg.\n", firstName, lastName, age, weight );
        System.out.printf("je m'apelle %s %s, j'ai %d et je pese %.1f kg.", firstName, lastName, age, weight );
    }
}
