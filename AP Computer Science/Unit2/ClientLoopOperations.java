package Unit2;
import java.util.*;
public class ClientLoopOperations
{
    public static void main()
    {
        // will test each respective method for, while, do while, power, and self divisor
        System.out.println(LoopOperations.forLooper(5));
        System.out.println(LoopOperations.whileLooper(60));
        System.out.println(LoopOperations.doWhileLooper(15));
        System.out.println(LoopOperations.power(2,-3));
        System.out.println(LoopOperations.selfDivisor(155));

        
    }
    //extended challenge
    public static void main1()
    {
        Scanner kin = new Scanner(System.in);
        int guess = 0;
        int number =(int)(Math.random() * 100 + 1);
        System.out.print("Input a number: ");
        int input = kin.nextInt();
        //computer guesses
        int computerInput =(int)(Math.random() * 100 + 1);
        System.out.println(computerInput);
        //user guesses
        //the loop allows the user to guess different number until they guess the right random number
        while(input != number)
        {
            // the if the user inputs a number to low or to high the if statement requires them to try again
            if(input < number)
            {
                System.out.println("The computer got " + computerInput);
                System.out.print("Sorry, you number is to low, try again: ");
                number = kin.nextInt();
                guess++;
                //the if statement makes the computer generated random number try and find the variable number
                if(computerInput < number)
                {
                    computerInput = (100-computerInput)/2 + computerInput;
                }
                else if(computerInput>number)
                {
                    computerInput = computerInput - (100-computerInput)/2;
                }
                if(computerInput == number)
                {
                    System.out.println("The computer got the number "+ number);
                    break;
                }   
                
            }
            else if(input > number)
            {
                System.out.println("The computer got "+computerInput);
                System.out.print("Sorry, your number is to high, try again:");
                input = kin.nextInt();
                guess++;
                if(computerInput< number) 
                {
                    computerInput = (100-computerInput)/2 + computerInput;
                }
                else if(computerInput>number)
                {
                    computerInput = computerInput/2 - computerInput;
                }
                if(computerInput == number)
                {
                    System.out.println("The computer got the number");
                    break;
                }
            }
        }
        if(computerInput == number)
        {
            System.out.println("Sorry the computer got the answer first");
        }
        else
        {
            System.out.println("You got the number " + number + " after " + guess + " guesses");
        }
    }

}
