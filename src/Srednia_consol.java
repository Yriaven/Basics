import java.util.Scanner;

/**
 * Created by yriaven on 14.03.17.
 */
public class Srednia_consol {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);

        int [] oceny = new int [5];
        int sumaocen = 0;
        


        for (int i = 0; i <oceny.length ; i++) {
            System.out.println("Wpisz ocenę");
            oceny [i] = skan.nextInt();
            sumaocen+=oceny[i];

        }

        double sredniaocen = sumaocen/oceny.length;
        System.out.println(sredniaocen);
    }
}
