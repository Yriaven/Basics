import java.util.Scanner;

/**
 * Created by yriaven on 12.03.17.
 */
public class CodeForces_StonesAndTheTable {

    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);

        int n = skan.nextInt();
        int score = 0;
        String stones = skan.next();

        for (int i = 0; i <n-1 ; i++) {

            if (stones.charAt(i)==stones.charAt(i+1))
            {
                score++;
            }

        }



        System.out.println(score);



    }
}
