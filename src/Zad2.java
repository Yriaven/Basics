import java.util.Scanner;

/**
 * Created by yriaven on 09.04.17.
 */
public class Zad2 {
    public static void main(String[] args) {

        Scanner skan = new Scanner(System.in);

        char [] litery = new char[26];
        int liczba = 65;
        char x = 'A';
        int [] tab = new int[26];


        for (int i = 0; i <litery.length ; i++) {

            litery[i]=x;
            tab[i]=liczba;
            System.out.println(litery[i]+""+tab[i]);



            x++;
            liczba++;
        }






    }
}
