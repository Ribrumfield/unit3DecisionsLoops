import java.util.Scanner;
import java.lang.Math;

public class Spectrum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the wave lenght you would like to calculate: ");
        double i = in.nextDouble();
        
        if (i >= Math.pow(10,-1))
        {
            System.out.println("These are Radio Waves");
        }
        else if (i <= Math.pow(10,-1) && i >= Math.pow(10,-3))
        {
            System.out.println("These are Microwaves");
        }
        else if (i <= Math.pow(10,-3) && i >= 7 * (Math.pow(10,-7)))
        {
            System.out.println("These are infered waves");
        }
        else if (i <=  7 * (Math.pow(10,-7)) && i >=  4 * (Math.pow(10,-7)))
        {
            System.out.println("These are Visable Light Rays");
        }
        else if (i <=  4 * (Math.pow(10,-7)) && i >= Math.pow(10,-8))
        {
            System.out.println("These are Ultraviolet Rays");
        }
        else if ( i <= Math.pow(10,-8) && i >= Math.pow(10,-11))
        {
            System.out.println("These are X-Rays");
        }
        else
        {
            System.out.println("These are Gamma rays");
        }        
    }
}