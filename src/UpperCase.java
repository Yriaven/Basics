import java.util.Scanner;

import static java.awt.SystemColor.text;

/**
 * Created by yriaven on 18.03.17.
 */
public class UpperCase {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);


        String text = skan.next();
        System.out.println(text);
        char x = text.charAt(1);




        String effect = text.toLowerCase();
        String effect2 = text.toUpperCase();

        System.out.println(effect);
        System.out.println(effect2);
    }
}
