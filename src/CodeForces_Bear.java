import java.util.Scanner;

/**
 * Created by yriaven on 18.03.17.
 */
public class CodeForces_Bear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int years = 0;

        while (a<=b)  //wykonuj dopóki A będzie mniejsze lub równe B
        {
            a = a*3;
            b = b*2;
            years++;
        }


        System.out.println(years);


    }
}
