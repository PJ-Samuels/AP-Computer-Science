package Unit3;
import java.util.*;
public class Lesson_12
{
    public static void main()
    {
        //problem 3 
        int p = 0,k=0;
        int m =97;
        while(m<=195)
        {
            k = k*k+3*m;
            p = p+m+1;
            m++;
        }
        //problem 4 
        int q = 0;
        int v = 2;
        do
        {
            k = k*k+3*v;
            q = (int)(Math.sqrt(q + v + 1));
            v*= 3;
        }
        while(v <= 195);
        //problem 9
        int i =0,j=0;
        while(i<=3)
        {
            for(j=0;j<=2;j++)
            {
                System.out.print(i+"," + j+" ");
            }
            i++;
        }
        //problem 13
        double w = 92.801;
        j = 0;
        do
        {
            j = j+2;
            if(j>-100)
                continue;
            w+=3;
        }while(j<6);
        System.out.println(w);
        
        Scanner kin = new Scanner(System.in);
        int input;
        do //the program will run until the user enters 0
        {
            System.out.print("Please input a number(input 0 to stop):");
            input = kin.nextInt();
            //the user will input a number and the program will square the input
            //the user will enter 0 to 
            if (input==0)
                System.out.println("");
            else 
            {
                int b = input*input;
                System.out.println(b);
            }
        }
        while(input!=0);
    }
}
