package Unit1;
public class ClientPoint
{
    public static void main()
    {
        //constructor methods
        Point p1 = new Point(5,6);
        System.out.println(p1);
        Point p2 = new Point();
        System.out.println(p2);
        //accessor methods
        double pointX = p1.getX1();
        System.out.print("The Point coordinates = "+ p1.getX1());
        double pointY = p1.getY1();
        System.out.println(","+p1.getY1());
        double pointX2 = p2.getX1();
        System.out.print("The Point cordinates = "+ p2.getX1());
        double pointY2 = p2.getY1();
        System.out.print(","+ p2.getY1());
        //toStringMethods
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        //Mutator methods
        ////Midpoint method
        System.out.println("the midpoint = "+p1.midpoint(12,14));
        System.out.println("the midpoint = "+p2.midpoint(12,14));
        ////CompareTo Method
        Point newP = new Point(5,2);
        System.out.println(p1.compareTo(newP));
        System.out.println(p2.compareTo(newP));
        ////Distance Method
        Point newP2 = new Point(3,9);
        Point newP3 = new Point(7,8);
        
        System.out.println("the distance ="+p1.distance(newP2,newP3));
        System.out.println("the distance = "+p1.distance(newP3,newP2));
        
        System.out.println("the distance = "+p2.distance(newP2,newP3));
        System.out.println("the distance = "+p2.distance(newP3,newP2));
        ////Slope method
        Point newP4 = new Point(9,6);
        Point newP5 = new Point(8,2);
        System.out.println("The slope is ="+p1.slope(newP4,newP5));
        System.out.println("The slope is = "+p2.slope(newP5,newP4));
    }
}
