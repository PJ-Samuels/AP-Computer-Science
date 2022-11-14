package Unit2;
import java.util.*;

public class Lesson10A
{
    public static void main ()
    {
        int x = 3,p=5,y=-8;
        switch(x)
        {
            case 2: 
                p++;
                break;
            case 3:
            case 4:
                y+=(--p);
                break;
            case 5:
                y+=(p++);
                break;
        }
        System.out.println(y);
        Scanner kin = new Scanner (System.in);
        String choice = kin.nextLine();
        char myChar = choice.charAt(0);
        int l = 1;
        switch(myChar)
        {
            case 'g':
            case 'G':
                l = ++l;
                System.out.println(l);
                break;
            case 'm':
            case 'M':
                l = --l;
                System.out.println(l);
                break;
            default:
                l = l+100;
                System.out.println(l);
                break;
                
        }
        String s= "green";
        int q=0;
        switch(s)
        {
            case "Red":
                q++;
            case "Green":
                q++;
            case "Blue":
                q++;
            case "yellow":
                q++;
            default:
                q++;
            
        }
        System.out.println(--q);
        char letter = 'z';
        int speed = kin.nextInt();
        switch(speed)
        {
            case 75:
                System.out.println("Exceeding speed limit");
            case 69:
            case 70:
                System.out.println("getting close");
            case 65: 
                System.out.println("cruising");
            default:
            
                if(speed<65)
                {
                    System.out.println("Very slow");
                }        
        }
        String d = "X";
        char k = 'x';
        
        switch(k)
        {
            case 'X':
                 k = 'X';
        }
        }
    }

