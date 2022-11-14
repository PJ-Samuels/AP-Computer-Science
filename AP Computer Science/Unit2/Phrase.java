package Unit2;
public class Phrase
{
    private String currentPhrase;
    /** 
     * Constructs a new Phrase object
     */
    public Phrase( String p )
    {
        currentPhrase = p ;
    }   
    /**
     * returns the index of the nth occurence of str in the current phrase;
     * returns -1 if the nth occurence does not exist.
     * Precondition: str.length() > 0 and n > 0
     * Postcondition: the current phrase is not modified
     */
    public int findNthOccurence( String str , int n )
    {
        // don't imediantly write code
        // read directions and write down what you think you need to do

        /**
         * return either -1 or nth index 
         * can't say - currentPhrase = ...
         * need to call indexOf(str,...)
         * loop
         * 
         */
        int index = -1;
        int count = 0;
        for(int i = 0; i < currentPhrase.length(); i++)//current length() should be <=N
        {
            count++;
            index = currentPhrase.indexOf(str, index+1);       
            if(count == n)
            {
                break;
            }
        }
        return index;
    }
    /**
    * Modifies the current phrase by replacing the nth occurence of str with repl
    * If the nth occurence does not exist, the current phrase is unchanged
    * Precondition: str.length() > 0 and n > 0
    */
    public void replaceNthOccurrence( String str , int n , String repl )
    {    
        /**
         * do currentPhrase = ...
         * pull out str put in replace (substring)
         * call nthOccurrance Method
         * if nth is -1, no change 
         * no loop in this method b/c its already done in the other method
         */
        // int nthIndex = find NthOccurrence(str,n);
        //if(nthindex == -1)
          //  return;
        int f1 = findNthOccurence(str,n);
        String replaceString = currentPhrase.replace(currentPhrase.substring(f1,f1+repl.length()),repl);
        System.out.println(replaceString);
       
    } 
    /**
    * Returns the index of the last occurrence of str in the current phrase;
    * returns -1 if str is not found
    * Precondition: str.length() > 0
    * Postcondition: the current phrase is not modified
    */
    public int findLastOccurrence( String str )
    {          
        return currentPhrase.lastIndexOf( str );   
    }    
    /**
    * returns a string containing the currrent phrase
    */
    public String toString()
    {
        return currentPhrase;
    }
}



