import java.util.Scanner;

/**
 * Created by yriaven on 25.02.17.
 */
public class Test {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        int n = skaner.nextInt();
        int score = 0;

        for (int i = 0; i <n ; i++) {

            int a = skaner.nextInt();
            int b = skaner.nextInt();
            int c = skaner.nextInt();

            if (a + b + c >=2)
            {
                score++;
            }
        }


        System.out.println(score);
    }
}
