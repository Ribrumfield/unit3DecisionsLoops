//1) word1 is lexicographically greater than "aaa"
//2) word1 is lexicographically equal to word2
//3) word1 is lexicographically less than word2 
//4) word1 and word2 have the same three-letter prefix


import java.util.Scanner;


public class stringcompare
{
    public static void main (String []args)
    {
        String word1 = "catalog";
        String word2 = "cat";
        //String name1 = "";
        //Scanner scan = new Scanner(System.in);
        //name1 = scan.nextLine();
        if (word1.equals("aaa"))
        {
        System.out.println ("they are equal");
        }
        else
        {
        System.out.println ("they are not equal");
        }
        
       int result = word1.compareTo(word2);
       
        if (result == 0)
        {
        System.out.println ("word1 = word2");
        }
        else if (result < 0)
        {
        System.out.println ("name 1 is less than name 2 lexographicly");
        } 
        else if (result > 0)
        {  
        System.out.println ("name 1 is greater than name 2 lexographicly");
        }
        else
        {
        System.out.println ("explosions");
        } 
        
        String part1 = word1.substring(0,3);
        String part2 = word2.substring(0,3);
        int resulting = part1.compareTo(part2);
        System.out.println (resulting);
        if (resulting == 0)
        {
            System.out.println ("explosions");
        }
      
    }
        
   
}