/**
 * PJ Samuels
 * The program will randomly generate two die and if the the total of the die is equal to 7 or11 they win if it is equal to 2 , 3, orr 12 they lose if neither of these the program will then  take the user's first total from the die and will roll again until the user gets that original value(a win) or until they get 7 or 11(a lose), this specific process is repeated until a win or lose. The user is then asked whether they want to play again or stop(1 = play again 2 = stop)
 * Extended Challenge: The user can input how much money they start off with and how much they want to bet (the user cannot bet more than they have or a negative num)
 */
package Unit3;
import java.util.*;
public class Lab_15
{
    public static void main()
    {
        Scanner kin = new Scanner(System.in);
        int input;
        int input2;
        System.out.print("How much money do you have: ");
        int money = kin.nextInt();
        /**
         * The for loop will make sure the user enters a positive amount of money or will not continue
         */
        for(int i = 1; i==1;i++)
        {
            if(money <= 0)
            {
                System.out.println("Invalid entry, money must be positive");
                --i;
                System.out.print("Please re-enter the amount you have: ");
                money = kin.nextInt();
            }
            else
                i++;
        }
        /**
         * The do while loop will execute the entire game, if the dice rolled are equal to 7 or 11 the first round, the user wins and if it is 2, 3 , 
         *      or 12 the user loses the first round if they would like to play again the program will repeat if not it will end
         *      
         * If the user doesn't win or lose the first round, the program will take its current dice value and if they roll that value they win,   
         *      if they roll a 7 or 11 they lose, this is repeated until a win or lose occurs
         */
        do 
        {
            System.out.println("You current balance is " + money + "$");
            int bet;
            System.out.print("How much money would you like to bet: ");
            bet = kin.nextInt();
            /**
             * The for loop prevents the user from entering a number higher than the balance they have already input
             */
            for(int i = 1; i==1;i++)
            {
                /** 
                 * if the input is more than than the bet then the for loop will continue until the user enters a valid number 
                 */
                if(money < bet)
                {
                    System.out.println("Invalid entry, bet cannot be more than money");
                    i--;
                    System.out.print("Please Enter a valid number: ");
                    bet = kin.nextInt();
                }
                else if (bet<0)
                {
                    System.out.println("Invalid entry, bet cannot be less than 0");
                    i--;
                    System.out.print("Please Enter a valid number: ");
                    bet = kin.nextInt();
                }
                else
                    i++;
            }
            System.out.println("The 2 die will randomly be generated");
            int d1 = (int)(Math.random()*6+1);
            int d2 = (int)(Math.random()*6+1);
            int total = d1+d2;
            int total2;
            System.out.println("Die 1 = " + d1);
            System.out.println("Die 2 = " + d2);
            System.out.println("The total is " + total);
            boolean result;
            /**
             * This if statement determines if the user wins or loses or neither, 
             *      if the user wins or loses the program will ask if they would like to continue else the program will use the user's old dice value 
             *      and roll until they win or lose 
             */
            if(total == 7 || total == 11)
            {
                money = money + bet;
                System.out.print("You win, you now have " + (money) + " dollars");
            }
            else if(total == 2||total == 3|| total == 12)
            {
                money = money - bet;
                System.out.print("You lose, you now have "+ (money) + " dollars");
            }
            else 
            {
                /**
                 * This do while loop will store the first value that the user rolled and will roll new die until they win (rolls its previous roll)
                 *      or loses (rolls a 7 or 11)
                 */
                System.out.println("You win if the dice rolls " + total + ", if it rolls a 7 or 11, you lose.");
                do
                {
                   int d3 = (int)(Math.random()*6+1);
                   int d4 = (int)(Math.random()*6+1);
                   total2 = d3 + d4;
                   System.out.println("Die 3 = " + d3);
                   System.out.println("Die 4 = " + d4);
                   System.out.println("Your new total is " + total2);
                   result = (total2 == total||total2 ==7||total2 == 11);
                   /**
                    * If the user rolls a 7 ,11 or their previous value the if statement will lead to the end of the do while loop if not the 
                    *       if statement makes the do while loop continue until the user wins or loses
                    */
                   if (total2 == total)
                   {
                       money = money + bet;
                       System.out.print("You win, you now have " + (money) + " dollars");
                   }
                   else if (total2 == 7||total2 == 11)
                   {
                       money = money - bet;
                       System.out.print("You lose, you now have " + (money) + " dollars");
                   }
                   else 
                        System.out.println("The dice will roll again until the game is over.");
                }
                 while(!result);
            }
            System.out.print(", would you like to play again (enter 1 to continue and 2 to stop): ");
            input = kin.nextInt();
        }
        while(input!= 2);
    }
}


