import java.util.Scanner;

public class Leap_year
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the year you would like to calculate: ");
        int year = in.nextInt();
        
        if (year % 4 == 0)
        {
            System.out.println("this year is a leap year");
        }
        else
        {
            System.out.println("This year isnt a leap year");
        }
        
    }
}