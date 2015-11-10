import java.util.Scanner;
import java.util.Random;

public class montyhall
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose Door 1 , 2 , or 3");
        int num = scan.nextInt();
        
        Random rand;
        int Door1 = rand.nextInt((3 - 1) + 1) + 1;
        int Door2 = rand.nextInt((3 - 1) + 1) + 1;
        int Door3 = rand.nextInt((3 - 1) + 1) + 1;
        
        
        System.out.println(Door1+ ""+Door2+""+ Door3);
    }
}
