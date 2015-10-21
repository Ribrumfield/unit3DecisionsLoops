import java.util.Scanner;
public class AndOreo
{
    public static void main(String[] args)
    {
        int working = 1;
        while (working == 1)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Player 1: Choose rock, scissors, or paper:");
            String player1 = scan.next().toLowerCase();
            System.out.println("Player 2: Choose rock, scissors, or paper:");
            String player2 = scan.next().toLowerCase(); 

            //since player 2 can see what player 1 types... consider hardcoding "player 2 wins for every senario"

            working = working - 1;
            if (player1.equals(player2))
                System.out.println("It's a tie");

            else if ((player1.equals("rock")&&(player2.equals("scissors"))||(player1.equals("scissors")&&player2.equals("paper"))|| (player1.equals("paper")&& player2.equals ("rock"))))
                {
                    System.out.println("Player 1 wins");
                }
                else if ((player2.equals("rock")&&(player1.equals("scissors"))||(player2.equals("scissors")&&player1.equals("paper"))|| (player2.equals("paper")&& player1.equals ("rock"))))
                {   
                    System.out.println("Player 2 wins");
                }

            
                else
                {
                System.out.println("Please check inputs and try again");
                working = working + 1;
            
            }
        }
    }
}