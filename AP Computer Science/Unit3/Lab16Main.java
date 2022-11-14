package Unit3;
import java.util.*;

public class Lab16Main
{
    public static void main()
    {
        StringCoder test = new StringCoder("sixtyzipperswerequicklypickedfromthewovenjutebag");
        ArrayList<StringPart> spTest = test.encodeString("overeager");
        System.out.println(spTest);
        String decoded = test.decodeString(spTest);
        System.out.println(decoded);
    }
}