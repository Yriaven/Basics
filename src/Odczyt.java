import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Odczyt{
    public static void main(String[] args) throws FileNotFoundException{

        Scanner skan = new Scanner(System.in);
        PrintWriter zapis = new PrintWriter("ala.txt");
        String zdanie = skan.next();

        zapis.print(zdanie);
        zapis.close();

    }
}