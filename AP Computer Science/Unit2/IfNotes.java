package Unit2;

public class IfNotes
{
    public static void main()
    {
        /**
         * boolean = ture or false 
         * 
         * boolean operators
         * ! = not
         * | = or
         * & = and
         * ^ = exclusive or
         * || = or with short cicuit evaluation
         * &&= and with short circuit evaluation
         * 
         * or - this is true if either statements are true
         * 
         * p | q     p || q
         * T | T = T
         * T | F = T
         * F | T = T
         * F | F = F
         * 
         * short circuit evaluation doest check the seconds doncidtiounless it has to 
         * T || ..... <----- doesnt check beacuse true or ... is true
         * 
         * F || ..... <----- has to check the seconds becasue we don't know its result yet
         * 
         * 
         * and = this is true only if both statements are true 
         * p & q     p && q
         * T & T = T
         * T & F = F
         * F & T = F
         * F & F = F
         * 
         * short circuit evaluation doest check the seconds doncidtiounless it has to 
         * F && ..... <----- doesnt check beacuse false or ... is false
         * 
         * T && ..... <----- has to check the seconds becasue we don't know its result yet
         * 
         * 
         * 
         * 
         * 
         *  exclussive or - ^ = this is true only if one condition is true not both
         * p ^ q    
         * T ^ T = F
         * T ^ F = T
         * F ^ T = T
         * F ^ F = F
         * 
         * 
         * order of operations
         * &
         * ^
         * |
         * 
         * 
         * 
         * deMorgans law 
         * Its about how a note distrubuites across a boolean operatiom
         * !(p||q) = !p&&!q
         * !(p&&q) = !p||!q
         * 
         * 
         * what creates a condition?
         * ==       equal to
         * !=       not equal to
         * >        greater than
         * >=       greater than or equal to 
         * <        less than
         * <=       less than or equal to
         * 
         * if (!(x>7))  -->  if(x<=7)
         */
        
        int a = (int)(Math.random()*11-5);   // random number -5 through 5
        int b = (int)(Math.random()*10+1);   // random number 1-10
        for( int x = 0; x < 100; x++)
            if(a != 0 && b/a > .5)
                System.out.println("Stuff");
                
        // a is increased twice
        if(a++>0| a++<5)
            System.out.println("Stuff");
        //a is increased twice pnly if a++ >0 is false 
        if(a++>0 || a++ <5)
            System.out.println("Stuff");
            
          
        
    }
}