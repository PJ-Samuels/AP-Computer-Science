package Unit3;


import java.util.*;

public class Lesson_11
{
    public static void main()
    {
                //1 
        int j =0;
        for (int g = 0;g<5;g++)
            j++;
        System.out.println(j);
        int s = 1;
        //2
        for(j = 3;j>=0;j--)
        {
            s=s+j;
            
        }
         System.out.println(s);
        //3
        int p = 6;
        int m = 20;
        
        for (j = 1; j<p;j++);
        {
            m=m+j*j;
            
        }
        System.out.println(m);
        // 4 
        double a = 1.0;
        for(j= 0 ;j<9;j++)
        {
            a*=3;
        }
        System.out.println(j);
        //5
        for (int iMus=0;iMus<10;iMus++)
        {
            int b = 19+iMus;
            
        }
        //6 
        double d = 100.01;
        int b = 0 ;
        for(int iMus=0;iMus<10;iMus++)
            b=19+iMus;
            d++;
        System.out.println(d);
        // 7
        for (int i = 3; i<=24;i*=2)
            System.out.println(i);
        //8
        for (int i = 24; i>=3; i/=2)
            System.out.println(i);
        //9
        int w = 0;
        for (int h = 0 ; h<=10;h++)
        {
            if(h==5)
            {
                break;
            }
            else
            {
                w++;
            }
        }
        System.out.println(w);
        //11
        int u,l;//i =l u=j
        for(l=10;l<100;l=l+10)
        {
            u=l/2;
            System.out.println(u);
        }
        //12
        int r;
        for(j=1;j<10;j=j*2)
        {
            r=2*j;
            System.out.println(r);
        }
    }
}
