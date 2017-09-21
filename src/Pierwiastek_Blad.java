import java.util.Scanner;

/**
 * Created by yriaven on 02.04.17.
 */
public class Pierwiastek_Blad {
    public static void main(String[] args) {

        Scanner skan = new Scanner(System.in);

        double liczba = skan.nextDouble();

        double pierwiastekKwadratowy = Math.sqrt(liczba);

        double przyblizony_blad = liczba-Math.pow(pierwiastekKwadratowy,2);  //błąd zaokrąglenia

        System.out.println("Pierwiastek z   "+liczba+"wynosi   "+pierwiastekKwadratowy+"Przybliżony błąd to:   "+przyblizony_blad);
    }
}
