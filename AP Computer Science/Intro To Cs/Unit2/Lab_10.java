/**
 * PJ Samuels
 * Part 1: The program use a random number generator(1-2) to flip a coin and say whether the coin lands on heads or tails.
 * If the program generates 1 = heads 2 = tails .
 * Part 2: The user enters a year into the program and the computer determines whether the year is a leap year or not,
 * if the year%4 is 0 then it is a leap year, if not, it is not a leap year.Also if the year%100 and year modula%400 dont equal 0,
 * that year is not a leap year.
 * Part 3: The program randomly generates a number 1-5, in ascending order each number is Paper, Rock, or Scissors.
 * The user enters one of the words and the program will determine if user has won lost or tied(rules below).
 * Extended Challenge: The program includes Lizard and Spock in the Rock, Paper, Scissors Game.
 */
package Unit2;
import java.util.*;
public class Lab_10
{
    public static void main()
    {
        //Part 1 
        Scanner kin = new Scanner(System.in);
        int coin = (int)(Math.random()*2+1);
        System.out.println("Heads = 1");
        System.out.println("Tails = 2");
        System.out.println(coin);
        /**
         * The program will randomly generate 1 or 2. If the result is 1 the coin will be heads if the result is 2 the con will be tails 
         * 1 = heads
         * 2 = tails
         */
        switch (coin)
        {
            case 1://heads
                System.out.println("You got heads.");
                break;
            case 2://tails
                System.out.println("You got tails.");
                break;
            
        }
        //Part 3 - Rock, Paper, Scissors
        //Extended Challenge:include Lizard and Spock
        System.out.print("Enter Rock, Paper, Scissors, Lizard or Spock: ");
        String game = kin.nextLine();
        int rps= (int)(Math.random()*5+1);//rps = Rock Paper Scissors  
        /**
         * The switch statements,after randomly generating 5 cases/numbers will, take what the user has typed in an prints whether the user has won, lost or tied
         * Paper: Win = Rock and Spock, Lose = Lizard and Scissors
         * Rock: Win = Lizard and Scissors, Lose = Spock and Paper
         * Scissors: Win = Paper and Lizard, Lose = Rock and Spock
         * Lizard: Win = Paper and Spock, Lose = Scissors and Rock
         * Spock: Win = Scissors and Rock, Lose = Lizard and Paper 
         * Everything ties against itself
         */
        switch(rps)
        {
            case 1://Paper
                System.out.println("The computer has paper");
                if (game.equalsIgnoreCase("Paper"))
                {
                    System.out.println("You tie");
                }
                else if (game.equalsIgnoreCase("Scissors")) 
                {
                    System.out.println("You win");
                }
                else if (game.equalsIgnoreCase("Rock"))
                {
                    System.out.println("You lose");
                }
                else if (game.equalsIgnoreCase("Lizard"))
                {
                     System.out.println("You win");
                }
                else if (game.equalsIgnoreCase("Spock"))
                {
                    System.out.println("You lose");
                }
                break;
                
            case 2://Rock
                System.out.println("The computer has rock"); 
                if (game.equalsIgnoreCase( "Paper"))
                {
                    System.out.println("You win");
                }
                else if (game.equalsIgnoreCase("Scissors")) 
                {
                    System.out.println("You lose");
                }
                else if (game.equalsIgnoreCase("Rock"))
                {
                    System.out.println("You tie");
                }
                else if(game.equalsIgnoreCase("Lizard"))
                {
                    System.out.println("You lose");
                }
                else if (game.equalsIgnoreCase("Spock"))
                {
                    System.out.println("You win");
                }
                break;
            case 3://Scissors
                System.out.println("The computer has Scissors");
                if (game.equalsIgnoreCase( "Paper"))
                {
                    System.out.println("You lose");
                }
                else if (game.equalsIgnoreCase("Scissors")) 
                {
                    System.out.println("You tie");
                }
                else if (game.equalsIgnoreCase("Rock"))
                {
                    System.out.println("You win");
                }
                else if (game.equalsIgnoreCase("Lizard"))
                {
                     System.out.println("You lose");
                }
                else if (game.equalsIgnoreCase("Spock"))
                {
                    System.out.println("You win");
                }
                break;
                //////////Part of the extended Challenge
            case 4://lizard
                System.out.println("The computer has Lizard");
                if (game.equalsIgnoreCase( "Paper"))
                {
                    System.out.println("You lose");
                }
                else if (game.equalsIgnoreCase("Scissors")) 
                {
                    System.out.println("You win");
                }
                else if (game.equalsIgnoreCase("Rock"))
                {
                    System.out.println("You win");
                }
                else if (game.equalsIgnoreCase("Lizard"))
                {
                     System.out.println("You tie");
                }
                else if (game.equalsIgnoreCase("Spock"))
                {
                    System.out.println("You lose");
                }
            break;
            case 5://Spock
                System.out.println("The computer has Spock");
                 if (game.equalsIgnoreCase( "Paper"))
                {
                    System.out.println("You win");
                }
                else if (game.equalsIgnoreCase("Scissors")) 
                {
                    System.out.println("You lose");
                }
                else if (game.equalsIgnoreCase("Rock"))
                {
                    System.out.println("You lose");
                }
                else if (game.equalsIgnoreCase("Lizard"))
                {
                    System.out.println("You win");
                }
                else if (game.equalsIgnoreCase("Spock"))
                {
                    System.out.println("You tie");
                }
            break;
        }
        //Part 2 
        System.out.print("Please input a year: ");
        int year = kin.nextInt();
        
        /**
         * The if statement determines whether the year is a leap year or not by determining the result of the modula
         * if thhe modula = 0 the user has typed in a leap year if not the year is not a leap year
         * if the modula 100 is 0 and modula 400 isn't 0 the year is not a leap year
         */
        if (year < 0)
        {
            System.out.println("Error, year must be positive");
        }
        else
        {
            if (year%4 == 0)
            {
                if(year%100 == 0)
                {
                    if(year%400 > 0)
                    {
                        System.out.println("This is not a leap year.");
                    }
                    else
                    {
                        System.out.println("This is a leap year.");
                    }
               }
               else
               {
                   System.out.println("This is a leap year.");
               }
            }
        }
    }
}
