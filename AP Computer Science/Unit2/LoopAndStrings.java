package Unit2;
/**
 * PJ Samuels
 * Lab 8A
 */
public class LoopAndStrings
{
    /**
     * removeNumbers
     * This method takes all numbers out of a string statement a returns the resulting string without numbers
     * @return      String      returns a string with out the numbers in the original
     */
    public static String removeNumbers( String str )
    {
        // goes through each char value of the array 
        for(int i = 0; i < str.length(); i++)
        { 
            String f = str.substring(0,i);
            String m = str.substring(i,i+1);
            String b = str.substring(i+1);
            
            for(int j = 0; j < 10; j++)
            {
                // will take out the numbers if it is the middle letter or keep it how it is if it isnt
                if( Integer.valueOf(m) == j)
                {
                    str = f+b;
                    i--;
                }
                else
                {
                    str = f+m+b;
                }
            }
        }
        return str;
    }
    /**
     * countWords
     * The method counts all the words in a string and tell the total to the user
     * @return      int     the int is all the collective words in the string     
     */
    public static int countWords( String str )
    {
        int count = 1;
        //goes through the char values of the array
        for(int i = 0; i < str.length(); i++)
        {
            //will implement the int count if there is a space after a word
            if(str.charAt(i) == ' ')
                count++;
            
            
        }
        return count-1;
    }
    /**
     * mathStringInOrder
     * The method performs the operation within the string and then returns the answer of the operations
     * @return      int     returns an int of the result of the operations performed in the string
     */
    public static int mathStringInOrder( String str )
    {
        int x;
        int y;
        int result =0;
        // goes through the char values of the array
        for(int i = 0; i < str.length(); i++)
        {
            String f = str.substring(0,i);
            String m = str.substring(i,i+1);
            String b = str.substring(i+1);
            //depending on what the answer operation is the if statement will carry out that operation a find a result
            if(m.equals("+"))
            {
                x = Integer.valueOf(f);
                y = Integer.valueOf(b);
                result += x+y;

            }
            else if(m.equals("-"))
            {
                x = Integer.valueOf(f);
                y = Integer.valueOf(b);
                result += x-y;
            }
            else if(m.equals("*"))
            {
                x = Integer.valueOf(f);
                y = Integer.valueOf(b);
                result += x*y;
            }
            else if(m.equals("/"))
            {
                x = Integer.valueOf(f);
                y = Integer.valueOf(b);
                result += x/y;
                
            }         
        }
        return result;
    }
}
