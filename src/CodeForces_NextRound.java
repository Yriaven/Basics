import java.util.Scanner;

/**
 * Created by yriaven on 04.03.17.
 */
public class CodeForces_NextRound {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        int n = skaner.nextInt();  //liczba uczestników
        int k = skaner.nextInt();  //liczba porządkowa konkretnego uczestnika
        int [] tablica = new int [n];  //punkty kolejnych uczestników


        int wynik = 0;

        for (int i = 0; i <n ; i++) {

            tablica [i] = skaner.nextInt();

            if (tablica[i]>=tablica[k-1])
            {
                if (tablica[i]>0)
                {
                    wynik++;
                }
            }


        }
        System.out.println(wynik);

    }
}
