import java.io.IOException;
import java.util.Scanner;

/**
 * Created by yriaven on 02.04.17.
 */
public class SwitchCase {

    public static void main(String[] args) throws IOException {

        Scanner skan = new Scanner(System.in);
        char choice;


        System.out.println("MENU GŁÓWNE");
        System.out.println("Wybierz opcje:");
        System.out.println("1: Informacje o programie");
        System.out.println("2: Autorzy");
        System.out.println("3: Wyjście");

         choice = (char)System.in.read();

         switch (choice)
         {
             case '1':
             {
                 System.out.println("1: Program testowy z wykorzystaniem funkcji switch i case");
                 System.out.println("2: Zagnieżdżona instrukcja switch");
                 String choice2 = skan.next();   //system inread tu nie zadziała


                 switch (choice2)
                 {
                     case "1":
                         System.out.println("Tu nie ma nic ciekawego");
                         break;
                     case "2":
                         System.out.println("Tu też nic");
                         break;
                 }
             break;
             }

             case '2':
             {
                 System.out.println("Przemysław Bętkowski");
                 break;
             }

             case '3':
                 System.exit(0);
                 break;

             default:
                 System.out.println("Wybierz tylko '1', '2' lub '3'.");
         }

    }
}
