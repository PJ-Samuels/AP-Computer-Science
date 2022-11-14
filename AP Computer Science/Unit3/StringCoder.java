//Lab 16
package Unit3;
import java.util.*;
import Unit3.StringPart;
public class StringCoder
{
    private String masterString;
    
    /**
     * @param master  the master string for the StringCoder
     *      precondition: The master string contains all the letters
     *                      of the alphabet
     */
    public StringCoder( String master )
    {
        masterString = master;
    }
    
    /**
     * decodeString
     * the method decodes the given ArrayList<StringParts> to show the encoded word
     * @param  parts  an ArrayList of StringParts that are valid
     *                  in the master String
     *      Precondition: parts.size() > 0 
     *  @return  the String obtained by concatenatiing the parts 
     *              of the master String
     */
    public String decodeString( ArrayList<StringPart> parts )
    {
        String s = "";
        for(int i = 0; i < parts.size(); i++)
        {
            int start = parts.get(i).getStart(); 
            int length = parts.get(i).getLength();           
            s += masterString.substring(start,start+length);                       
        }
        return s;
    }
    
    /**
     * findPart
     * the method finds the first occurance of the given string in the masterString 
     * @param str  the string to encode using the master string
     *      Precodntion: all the characters in str appear in the master String
     *                      str.length() > 0
     * @return  a string part in the master string that matches the begining
     *          of str.  The returned string part has length at least 1
     */
    private StringPart findPart( String str )
    {
        int length = 0;
        int start = 0;
        StringPart arr = new StringPart(1,2);
        while (str.length() > 0)
        {
            if(masterString.indexOf(str) != -1)
            {
                arr = new StringPart(masterString.indexOf(str), str.length());
                break;
            }
            else 
                str = str.substring(0,str.length()-1);
        }
        System.out.println(arr);
        return arr;
    }
    
    /**
     * encodeString
     * the method encode the given word using the masterString
     * @param word  the string to be encoded
     *      precondition: all the characters in word appear in the master string
     *                      word.length() > 0
     * @return   an ArrayList of StringParts of the master string that
     *              can be combined to create word
     */
    public ArrayList<StringPart> encodeString( String word )
    {
        ArrayList<StringPart> arr = new ArrayList<StringPart>();
        while(word.length() > 0)
        {
            StringPart value = findPart(word);      
            int value1 =  value.getLength();
            System.out.println(value1);
            arr.add(value);
            word = word.substring(value1);
        }
        System.out.println(arr);
        return arr;
    }
    
    
}
