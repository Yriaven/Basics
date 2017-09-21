import java.util.Scanner;

/**
 * Created by yriaven on 30.03.17.
 */
public class BliskoSredniej {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);

        double [] liczby = new double [5];
        double suma = 0;


        for (int i = 0; i <5 ; i++) {

            liczby[i]=skan.nextDouble();
            suma= suma +liczby[i];

        }

        double srednia = suma/5;
        double wynik = liczby[1];

        for (int i = 0; i <4 ; i++) {

            double c = Math.abs(srednia-liczby[i]);

            if (c>Math.abs(srednia-liczby[i+1]))
            {
                wynik=liczby[i+1];
            }


        }


       System.out.println(srednia+"_______"+wynik);
    }
}
