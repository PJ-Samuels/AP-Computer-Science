package Unit2;
public class ClientLoopAndStringsB
{
    public static void main()
    {
        String s1 = "H3llo World";
        String s2 = "+5 54";
        int x = 39;
        int newWord = LoopAndStringsB.countMultiLetterWords(s1);
        String newNum = LoopAndStringsB.romanNumeral(x);
        int result = LoopAndStringsB.mathStringPreOrder(s2);
        System.out.println(newWord);
        System.out.println(newNum);
        System.out.println(result);
        
    }

}
