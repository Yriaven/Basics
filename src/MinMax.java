import java.util.Random;

/**
 * Created by yriaven on 15.04.17.
 */
public class MinMax {
    public static void main(String[] args) {

        int [] tablica = new int[10];

        Random rand = new Random();

        for (int i = 0; i <tablica.length ; i++) {

            tablica[i]=rand.nextInt(40);

            System.out.println(tablica[i]);

        }

        int max = tablica[0];
        int min = tablica[0];


        for (int i = 0; i <tablica.length ; i++) {

            if (tablica[i]>max)
                max = tablica[i];
            if (tablica[i]<min)
            {
                min = tablica[i];
            }

        }

        System.out.println("Max to:"+max+"   Minimum to:"+min);


    }
}
