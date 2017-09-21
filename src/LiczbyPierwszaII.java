import java.util.Scanner;

/**
 * Created by yriaven on 26.03.17.
 */
public class LiczbyPierwszaII {
    public static void main(String[] args) {

        boolean prime;

        for (int i = 2; i <100 ; i++) {
            prime=true;

            for (int j = 2; j<=i/j ; j++) {  //2,3,4,5,6

                if (i%j==0)
                {
                    prime=false;
                }

            }

            if (prime)
            {
                System.out.println(i+"liczba pierwsza");
            }
        }




    }
}
