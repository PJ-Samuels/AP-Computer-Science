package Unit2;
public class LoopAndStringsB
{
    /**
     * countMultiLetterWords
     * counts how many  real words are in the string , excludes all words with a number in it 
     * @return      int     the number of real words in the entire string
     */
    public static int countMultiLetterWords( String str )
    {
        int count = 1;
        //traveserses the string going through each char value
        for( int i = 0 ; i < str.length() ; i++ )
        {
            String m = str.substring( i , i + 1 ) ;  
            //looks for all numbers in the string if there are any
            for(int j = 0; j <=9 ; j++)
            {
                //checks to see if a the word has a number and will nit count the word if it does
                if(m.equals (String.valueOf(j)))
                {
                    // will increase the count for real words, words without numbers in them
                    for(int k = i; k<str.length();k++)
                    {
                        String m2 = str.substring(k,k+1);
                        if(m2.equals(" "))
                        {
                            count--;
                            i = k-1;
                            break;
                        }
                        else if( k == str.length()-1)
                        {
                            count--;
                            i = k;
                            break;
                        }
                        
                    }
                    break;
                }
                
            }
            if(m.equals(" "))
            {
                count++;
            }
        }
        return count;
        
    }
    
    /**
     * romanNumeral
     * 
     * @return      String      returns the roman numeral form of the input Int
     */
    public static String romanNumeral( int a )
    {
        int firstNum;
        firstNum = a/10;
        char s [] = new char[10];
        //traverse the char array to input an X for the tens place depending how big the tens place is
        for(int i = 1; i <=3 ; i++)
        {
            s[i-1] = 'X';            
            firstNum--;            
        }
        //will make the rest of the array values from the s char empty values
        for( int i = 0; i < s.length; i++)
        {
            if(s[i] != 'X')
            {
                s[i] = '\0';
                
            }
        }
        char arr2[] = new char[4];
        int i = a%10;
        //the if statement will determine what number is in the ones place given number
        if(i <= 3)
        {
            arr2[0] = 'I';
            //differentiates between 2 and 3 in the ones place
            if(i == 2)
            {
                arr2[1] = 'I';
            }
            else if( i == 3 )
            {
                arr2[2] = 'I';
                arr2[3] = 'I';
            }
        }
        else if(i == 4)
        {
            arr2[0] = 'I';
            arr2[1] = 'V';
        }
        else if(i >= 5 && i <= 8)
        {
            arr2[0] = 'V';
            //will determine if the number in the ones place in 6-8
            if(i == 6)
            {
                arr2[1] = 'I';
                    
            }
            else if(i == 7)
            {
                arr2[1] = 'I';
                arr2[2] = 'I';
                
            }
            else if(i == 8)
            {  
                arr2[1] = 'I';
                arr2[2] = 'I';
                arr2[3] = 'I';
            }
        }
        else if( i == 9)
        {
            arr2[0] = 'I';
            arr2[1] = 'X';
                
        }
        String arr3 = new String(arr2);
        String arr4 = new String(s);
        String arr5 = arr4+arr3;
        return arr5;
    }
    /**
     * mathStringPreOrder
     * takes the math operation in front of the number and executes it upon the other 2 other numbers
     * @return      int     returns the result of the operation
     */
    public static int mathStringPreOrder( String str )
    {
        String s1 = str.substring(0,1);
        int x;
        int y;
        int result;
        for(int i = 0; i<str.length(); i++)
        {
            String f = str.substring(0,i);
            String m = str.substring(i,i+1);
            String b = str.substring(i+1);
            if(m.equals(" "))
            {
                str = f+s1+b;
            }
        }
        result = LoopAndStrings.mathStringInOrder(str);
        return result;
    }

}
