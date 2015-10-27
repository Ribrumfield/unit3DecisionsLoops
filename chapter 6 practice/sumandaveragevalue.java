import java.util.Scanner;

/**
 * Write a description of class sumandaveragevalue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sumandaveragevalue
{
    public static double averageOfInputs()
    {
        Scanner scan = new Scanner( System.in);
        System.out.println("Enter a series of numbers and type a letter to quit");

        double total = 0;
        int count = 0;
        
        while(scan.hasNextDouble())
        {
            double number = scan.nextDouble();
            total += number;
            count ++;
        }
        
        double average = 0;
        if(count > 0)
        {
            average = total / count;   
        }
        
        return average;
    }
}
