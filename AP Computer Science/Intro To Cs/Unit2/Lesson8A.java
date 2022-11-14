package Unit2;

import java.util.*;

public class Lesson8A
{
    public static void main()
    {
        int z = 23, x = -109;
        double c = 2345.19, v = 157.03;
        boolean a = false, s = true;
        
        boolean gus = (x>0)&&(c==v);
        System.out.println(!gus);
        
        System.out.println(a||s);
        
        System.out.println(((-1*x)>0)&&(!a));
        boolean r = z==x;
        System.out.println(r||false);
        System.out.println((z!=x));
        
        boolean p = true, q = false;
        boolean b = (p && q);   
        
        int f = 402;
        boolean y = false,j = false;
        
        boolean w = f>0||y==j;//j=x
        //u = a l==b
        Scanner kin = new Scanner(System.in);
        int u = kin.nextInt();
        int l = kin.nextInt();
        if (u<l)
    {
       boolean kDog = true;
       System.out.println(kDog);
    }
    if (u>1)
    {
        boolean kDog = true;
        System.out.println(kDog);
    }
    System.out.println((true&&false)||((true&&true)||false));
    System.out.println(true && true || false);
    System.out.println(true|| true && false);
    System.out.println(false || true && false);
    System.out.println(false && true || false);
    
    if (u<l)
    {
    System.out.println("a doesn't equal b" + true);
    }
    if (u>l)
    {
    System.out.println("a doesn't equal b" + true);
    }
    }
}