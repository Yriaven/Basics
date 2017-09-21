import java.util.Scanner;

/**
 * Created by yriaven on 04.03.17.
 */
public class CodeForces_Team {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        int numberOfproblems = skaner.nextInt();


        int score2 = 0;

        int [] answers1 = new int[3];
        int [] answers2 = new int[3];
        int [] answers3 = new int[3];

        for (int i = 0; i <numberOfproblems ; i++) {
            answers1[i] = skaner.nextInt();

        }

        for (int i = 0; i <numberOfproblems ; i++) {
            answers2[i] = skaner.nextInt();
        }

        for (int i = 0; i <numberOfproblems ; i++) {
            answers3[i] = skaner.nextInt();

        }


        if (answers1[0]+answers1[1]+answers1[2]>=2)
        {
            score2++;
        }

        if (answers2[0]+answers2[1]+answers2[2]>=2)
        {
            score2++;
        }

        if (answers3[0]+answers3[1]+answers3[2]>=2)
        {
            score2++;
        }

        System.out.println(score2);
    }
}

