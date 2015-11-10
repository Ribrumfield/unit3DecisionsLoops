import java.util.Scanner;

public class Substrings
{
   public static void Substrings()
   {
       Scanner scan = new Scanner(System.in);
       String word;
       
       System.out.println("Please enter a word: ");
       word = scan.next ();
       int length = word.length();
       int counter = 0;
       while (length >= counter)
       {
          for (int i = 0; i < length - counter; i ++)
          {
            System.out.println(word.substring((i),(i + counter + 1)));
          }
          counter ++;
       }
     
    }
}
       