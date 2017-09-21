import java.util.Scanner;

/**
 * Created by yriaven on 21.03.17.
 */
public class Zad_1 {
    public static void main(String[] args) {

        Scanner skan = new Scanner(System.in);

        int n = skan.nextInt();   //liczba testóœ
        boolean b;
        int liczby [] = new int [n];

        for (int i = 0; i <n ; i++) {

            liczby[i] = skan.nextInt();
            b = true;


            for (int j = 2; j <=liczby[i]/j ; j++) {

                if (liczby[i]%j==0)
                {
                    b = false;

                    if (liczby[i]==1)
                    {
                        b = false;
                    }

                }

            }
            if (b)
            {
                System.out.println("TAK!!!");

            }

            if (!b)
            {
                System.out.println("NIE");
            }


        }


    }
}
