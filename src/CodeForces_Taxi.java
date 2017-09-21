import java.util.Scanner;

/**
 * Created by yriaven on 08.03.17.
 */
public class CodeForces_Taxi {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        int n = skaner.nextInt();  //number of groups

        int sumadzieci=0;


        for (int i = 0; i <n ; i++) {

            int children = skaner.nextInt();
            sumadzieci += children;

        }

        int ilośćtaksówek = sumadzieci/4;



        if (sumadzieci%4!=0)
        {
            ilośćtaksówek++;
        }



        System.out.println(ilośćtaksówek);
    }
}
