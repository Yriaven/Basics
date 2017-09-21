import java.util.Scanner;

/**
 * Created by yriaven on 28.03.17.
 */
public class Cale {

    public static double cale(double m)
    {
        double cale = m * 39.37;
        return cale;

    }


    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);

        int metry = skan.nextInt();


        System.out.println(cale(metry));

    }


}

