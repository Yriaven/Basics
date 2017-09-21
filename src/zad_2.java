/**
 * Created by yriaven on 21.03.17.
 */
public class zad_2 {
    public static void main(String[] args) {



    double stopa, metr, cal ;
    int licznik = 0;



        for (cal = 1; cal <144+1 ; cal++) {

            metr = cal / 39.37;
            System.out.println(cal + "to" + metr);
            licznik++;


            if (licznik==12)
            {

                System.out.println("......");
                licznik = 0 ;
            }

        }




    }
}
