import java.util.Scanner;

/**
 * Created by yriaven on 26.03.17.
 */
public class LiczbyPierwsze {


    public static void main(String[] args) {


        Scanner skaner = new Scanner(System.in);

        int a = skaner.nextInt();
        int suma = 0;


        for (int i = 1; i <a+1 ; i++) {

            if (a%i==0)
            {
                suma++;
            }

        }

        if (suma==2)
        {
            System.out.println("True");
        }

        else
        {
            System.out.println("False");
        }

    }

}
