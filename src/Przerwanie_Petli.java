import java.util.Scanner;

/**
 * Created by yriaven on 02.04.17.
 */
public class Przerwanie_Petli {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        System.out.println("Naciśnij S aby zakończyć pętlę");

        String text = skan.next();

        for (int i = 0;text!="S" ; i++) {


            System.out.println("Przebieg"+i);

        }
    }
}
