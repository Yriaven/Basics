import java.util.Scanner;

/**
 * Created by yriaven on 08.03.17.
 */
public class CodeForces_Anton {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        int n = skaner.nextInt();
        int A = 0;
        int D = 0;



        String text = skaner.next();

        for (int i = 0; i <text.length() ; i++) {

            if (text.charAt(i)=='A')
            {
                A++;
            }

            if (text.charAt(i)=='D')
            {
                D++;
            }

        }


        if (A>D)
        {
            System.out.println("Anton");
        }

        if (A<D)
        {
            System.out.println("Danik");
        }

        if (A==D)
        {
            System.out.println("Friendship");
        }
    }
}
