/**
 * Created by yriaven on 01.04.17.
 */
public class KlasyPodTesty {


    class Podklasa
    {
        String nazwa;


    }



    public static class Postac
    {

        String imie;
        String klasa;
        int level;

        public Postac(String imie, String klasa, int level) {
            this.imie = imie;
            this.klasa = klasa;
            this.level = level;
        }



    }

    public static void main(String[] args) {



        Postac postac1 = new Postac("Minsc", "Berserker", 8);
        Postac postac2 = new Postac("Dynaheir", "Mag", 6);


        System.out.println(postac1.imie + postac1.klasa + postac1.level);
        System.out.println(postac2.imie + postac2.klasa + postac2.level);
        System.out.println(postac1);

    }


}




