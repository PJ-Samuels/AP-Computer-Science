package Unit2;
public class ClientPhrase
{
    public static void main()
    {
        String s1 = "A cat ate late";
        String s2 = "an ";
        String s3 = "at";
        int x = 2;
        int y = 1;
        Phrase p1 = new Phrase(s1);
        System.out.println(p1.findNthOccurence(s3,x));
        
        Phrase p2 = new Phrase(s1);
        p2.replaceNthOccurrence(s3,y,s2);
        
        Phrase p3 = new Phrase(s1);
        System.out.println(p3.findLastOccurrence(s3));
        
        
        
    }

}
