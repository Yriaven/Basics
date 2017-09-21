import java.util.Scanner;

/**
 * Created by yriaven on 30.03.17.
 */
public class NajwiekszaZLiczb {
    public static void main(String[] args) {

        Scanner skan = new Scanner(System.in);

        int a = skan.nextInt();
        int b = skan.nextInt();
        int c = skan.nextInt();

        int m = a;

        if (b>a)
        {
            m=b;
        }

        if (c>b)
        {
            m=c;
        }


        System.out.println(m);
    }
}
