import java.util.Random;
import java.util.Scanner;

/**
 * Created by yriaven on 03.04.17.
 */
public class KodDostepu {
    public static void main(String[] args) {

        Scanner skan = new Scanner(System.in);

        Random r = new Random();
        int haslo = r.nextInt(10000);

        System.out.println("Wprowadz imię:");
        String imie = skan.next();
        System.out.println("Wprowadz nazwisko");
        String nazwisko = skan.next();
        String login = nazwisko.substring(0,4)+imie.substring(0,4);
        System.out.println("Twój login to:"+nazwisko.substring(0,4)+imie.substring(0,4));
        System.out.println("Twoje haslo to:   "+haslo);

        System.out.println("Wprowadz login:");

        String odpowiedz;
        int odpowiedz2;

        do {

            odpowiedz = skan.next();
            if (odpowiedz.equals(login))
            {
                System.out.println("Wprowadz hasło:");

                do {
                    odpowiedz2 = skan.nextInt();

                    if (odpowiedz2==haslo)
                    {
                        System.out.println("Dostęp przyznany");
                    }

                    else
                    {
                        System.out.println("Acces denied. Try again.");


                    }
                }

                while (odpowiedz2!=haslo);


            }

            else
            {
                System.out.println("Nieznany login");
            }
        }

        while (!odpowiedz.equals(login));





    }
}
