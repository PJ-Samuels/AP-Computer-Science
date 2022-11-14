package Unit1;
public class ClientBox
{
    public static void main()
    {
        Box b1 = new Box(13,14,12);
        System.out.println(b1);
        Box b2 = new Box();
        System.out.println(b2);
        int height = b1.getH();
        System.out.println("Height = "+ b1.getH());
        int length = b1.getL();
        System.out.println("Length = "+ b1.getL());
        int width = b1.getW();
        System.out.println("Width = "+ b1.getW());
        
        System.out.println("volume = "+ b1.volume());
        
        
        height = b2.getH();
        System.out.println("Height = "+ b2.getH());
        length = b2.getL();
        System.out.println("Length = "+ b2.getL());
        width = b2.getW();
        System.out.println("Width = "+ b2.getW());
        
    }
}