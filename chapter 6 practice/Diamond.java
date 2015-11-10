import java.util.Scanner;

public class Diamond
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = scan.nextInt();    
        num ++;
        String star ="*";
        String space = " ";
        
        // from top down to middle of the diamond
        for (int row = 0; row < num; row++)
        {
           for (int spaces = 0; spaces < num; spaces++)
           {
              System.out.print(" ");
           }           
           for (int stars = 0; stars < row; stars++)
           {
              System.out.print("*");
           }       
           System.out.println();
        }
        
        // Bottom of the diamond
        for( int row = num - 2; row>= 0; row--)
        {
           for( int spaces= 0; spaces < num - row - 1; spaces++)
           {
              System.out.print(" ");
           }
           for(int stars = 0; stars <row * 2 + 1;stars++)
           {
              System.out.print("*");   
           }
           System.out.println();
        }
        
    }
}
    