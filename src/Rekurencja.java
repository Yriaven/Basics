import java.util.Scanner;

/**
 * Created by yriaven on 12.03.17.
 */
public class Rekurencja {
    public static void main(String[] args) {

        //System.out.println(f(3));
        //System.out.println(potega(3,3));
        System.out.println(silnia(6));
    }


    static int f (int n)
    {
        if (n==0)
        {
            return 3;
        }

        else
        {
            return f (n-1)+2;
        }
    }



    static long potega (int p, int w)
    {
        if (w==0)
        {
            return 1;
        }

        else
        {
            return p*potega(p, (w-1));
        }


    }

    static int ciagFibonacciego (int n)
    {
        if (n==1 || n==2)
        {
            return 1;
        }

        else
        {
            return ((n-1)+(n-1));
        }
    }

    static int silnia (int n)
    {
        if (n==0)
        {
            return 1;
        }

        else
        {
            return n * silnia(n-1);
        }

    }

}

