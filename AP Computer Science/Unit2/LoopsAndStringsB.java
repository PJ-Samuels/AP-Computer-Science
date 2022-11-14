package Unit2;


public class LoopsAndStringsB
{
    
    
    
    public static int  countMultiLetterWordsV1( String str )
    {
        int firstSpace = 0;
        int secondSpace = str.indexOf(" ");
        int count = LoopAndStrings.countWords(str);
        while( firstSpace < str.length() )
        {
            for( int i = firstSpace ; i < secondSpace ; i++ )
            {
                if( str.charAt(i) == '1' || str.charAt(i) == '2' ||
                    str.charAt(i) == '3' || str.charAt(i) == '4' ||
                    str.charAt(i) == '5' || str.charAt(i) == '6' ||
                    str.charAt(i) == '7' || str.charAt(i) == '8' ||
                    str.charAt(i) == '9' || str.charAt(i) == '0' )
                {
                    count--;
                    break;
                }
            }
            firstSpace = secondSpace;
            secondSpace = str.indexOf(" " , secondSpace+1 );
            if( secondSpace == -1 )
                secondSpace = str.length();
        }
        return count;
    }
    
    public static int  countMultiLetterWordsV2( String str )
    {
        int wordCount = 0;
        int spaceAt = 0;
        
        while( spaceAt != -1 ) 
        {
            int nextSpaceAt = str.indexOf(" " , spaceAt + 1 ); 
            if( nextSpaceAt == -1 ) 
                nextSpaceAt = str.length();
            String word = str.substring( spaceAt+1 , nextSpaceAt );
            
            boolean isWord = true;
            for( int i = 0 ; i < word.length() ; i++ ) 
            {
                if( word.charAt( i ) >= 48 && word.charAt( i ) <= 57 ) 
                {
                    isWord = false;
                }
            }
            if( isWord )
                wordCount++;
            
            if( nextSpaceAt == str.length() )
                spaceAt = -1;
            else
                spaceAt = nextSpaceAt;
        }
        return wordCount;
    }
    
    /**
     * Note this one only works if no single word is made up of all numbers
     */
    public static int  countMultiLetterWordsV3( String str )
    {
        
        int firstSpace = 0;
        int secondSpace = str.indexOf(" ");
        boolean startOver = true;
        while( true )
        {
            for( int i = firstSpace ; i < secondSpace ; i++ )
            {
                if( str.charAt(i) == '1' || str.charAt(i) == '2' ||
                    str.charAt(i) == '3' || str.charAt(i) == '4' ||
                    str.charAt(i) == '5' || str.charAt(i) == '6' ||
                    str.charAt(i) == '7' || str.charAt(i) == '8' ||
                    str.charAt(i) == '9' || str.charAt(i) == '0' )
                {
                    str = str.substring( 0 , firstSpace ) +
                            str.substring( secondSpace );
                    firstSpace = 0;
                    secondSpace = str.indexOf(" ");          
                    
                    startOver = true;
                }
            }
            if( !startOver )
            {
                firstSpace = secondSpace;
                secondSpace = str.indexOf(" " , secondSpace+1 );
                if( secondSpace == -1 )
                    secondSpace = str.length();
                if( firstSpace == secondSpace )
                    break;                
            }
            startOver = false;
        }
        System.out.println(str.trim());
        return LoopAndStrings.countWords(str.trim());
    }
    
    
    public static int mathStringPreOrder( String str )
    {
        String opp = str.substring( 0 , 1 );
        String first = str.substring( 1 , str.indexOf(" ") );
        String second = str.substring( str.indexOf(" ") + 1 );
        String word = first + opp + second;
        return LoopAndStrings.mathStringInOrder( word );
    }
    
    
    
    public static String romanNumeral( int a  )
    {
        String str = "";
        while( a > 9 ) 
        {
            str += "X";
            a -= 10;
        }
        if( a == 9 ) 
        {
            str += "IX";
            a = 0;
        }
        if( a >= 4 ) 
        {
            if( a == 4 )
            {   
                str += "I";
            }
            str += "V";
            a -=5;
        }
        while( a > 0 ) 
        {
            a--;
            str += "I";
        }
        return str;
    }
    
    
    public static int mathEC( String str ) 
    {
        for( int i = 0 ; i < str.length() ; i++ ) 
        {
            int frontIndex=0 , backIndex=0;
            String front , back;
            // lets deal with * and / first
            if( str.charAt(i) == '*' || str.charAt(i) == '/' )
            {
                // trying to find the previous opperation
                //   54 + 67 - 4 * 5 / 3 + 3 * 5
                if( str.lastIndexOf("+" , i) > str.lastIndexOf("-" , i ) ) 
                {
                    frontIndex = str.lastIndexOf("+" , i) + 1 ;
                }
                else if( str.lastIndexOf("+" , i) < str.lastIndexOf("-" , i ) )
                {
                    frontIndex = str.lastIndexOf("-" , i ) + 1 ;
                }
                else
                {
                    frontIndex = 0;
                }
                front = str.substring( frontIndex , i );
                
                back = "";
                // lets find the backhalf
                for( int j = i+1 ; j < str.length() ; j++ )
                {
                    if( str.charAt(j) != '+' && str.charAt(j) != '*' &&  
                        str.charAt(j) != '-' && str.charAt(j) != '/' )
                        back += str.charAt(j);
                    else
                    {
                        backIndex = j-1;
                        break;
                    }
                    backIndex = j;
                }
                System.out.println("Front = " + front + "   str.charAt(i) = " + str.charAt(i) + 
                                                     "      back = " + back );
                int value = LoopAndStrings.mathStringInOrder( front + str.charAt(i) + back );
                str = str.substring( 0 , frontIndex ) + value + 
                                    str.substring( backIndex + 1 ) ;
                i=0;
            }
        }
        
        return LoopAndStrings.mathStringInOrder( str );
    }
}
