import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;

public class CircleOverlap
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      double xcenter1 = 0;
      double ycenter1 = 0;
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble(); 
      double xcenter2 = 40;
      double ycenter2 = 0;
      
      final double distace = Math.sqrt(Math.pow(abs(xcenter2 - xcenter1),2.0))+ (Math.pow(abs(ycenter2-ycenter1),2.0));

      // Your work goes here
      
      if ((radius1 + radius2) < distace)
      {
         System.out.println("the two circles are Disjoint");      
      }
      else if (radius1 > (radius2 + distace))
      {
         System.out.println("The two circles are mutually contained");
      }
      else if (radius2 > (radius1 + distace))
      {
          System.out.println("The two circles are mutually contained");
      }
      else if ((radius1 + radius2) >= distace && !(radius1 > (radius2 + distace) && !(radius2 > (radius1 + distace))))
      {
      System.out.println("The two circles are overlapping");
      }
   }
}