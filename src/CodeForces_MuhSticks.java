import java.util.Scanner;

/**
 * Created by yriaven on 12.03.17.
 */
public class CodeForces_MuhSticks {
    public static void main(String[] args) {

        Scanner skan = new Scanner(System.in);

        String sticks = skan.next();
        int nogi = 0;

        for (int i = 0; i <sticks.length()-1 ; i++) {

            if (sticks.charAt(i)==sticks.charAt(i+1))
            {
                nogi++;
            }

        }
        System.out.println(nogi);

    }
}
