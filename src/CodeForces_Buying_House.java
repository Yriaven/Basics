import java.util.Scanner;

/**
 * Created by yriaven on 10.04.17.
 */
public class CodeForces_Buying_House {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        int n = skaner.nextInt();
        int m = skaner.nextInt();
        int k = skaner.nextInt();
        int odleglosc1 = 0;
        int odleglosc2 = 0;

        int tablica [] = new int[n];

        for (int i = 0; i <tablica.length ; i++) {

            tablica[i] = skaner.nextInt();


        }

        for (int i = m; i <tablica.length ; i++) {

            odleglosc1+=10;
            if (tablica[i]<=k && tablica[i]!=0)
            {
                break;
            }

        }

        for (int i = m; i >=0 ; i--) {

            odleglosc2+=10;

            if (tablica[i]<=k && tablica[i]!=0)
            {
                break;
            }

        }

        if (odleglosc1<odleglosc2)
        {
            System.out.println(odleglosc1);
        }

        else
        {
            System.out.println(odleglosc2);
        }




    }
}
