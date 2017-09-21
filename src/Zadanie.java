import java.io.IOException;
import java.util.Scanner;

/**
 * Created by yriaven on 09.04.17.
 */
public class Zadanie {
    public static void main(String[] args) throws IOException {

        Scanner skan = new Scanner(System.in);

        char przerwa;
        int licznik = 0;


        do {
            przerwa = (char) System.in.read();
            licznik++;
            System.out.println(licznik);

        }

        while (przerwa!='.');

    }
}
