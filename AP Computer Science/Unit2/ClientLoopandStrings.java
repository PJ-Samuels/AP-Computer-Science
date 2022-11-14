package Unit2;
public class ClientLoopandStrings
{
    public static void main()
    {
        String s1 = "Hi guys1";
        String s2 = "Hello F3llOW";
        String s3 = "5+4";
        String newLine = LoopAndStrings.removeNumbers(s1);
        int number1 = LoopAndStrings.countWords(s2);
        int number2 = LoopAndStrings.mathStringInOrder(s3);
        System.out.println(newLine);
        System.out.println(number1);
        System.out.println(number2);
    }
}
