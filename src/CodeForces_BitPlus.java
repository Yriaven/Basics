import java.util.Scanner;

/**
 * Created by yriaven on 08.03.17.
 */
public class CodeForces_BitPlus {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        int n = skaner.nextInt();
        int x = 0;

        for (int i = 0; i <n ; i++) {

            String text = skaner.next();

            if (text.contains("++"))
            {
                x++;
            }

            if (text.contains("--"))
            {
                x--;
            }

        }
        System.out.println(x);
    }

}
