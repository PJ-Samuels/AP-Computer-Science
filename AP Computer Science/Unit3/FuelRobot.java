package Unit3;
import java.util.*;
public class FuelRobot
{
    private int index;
    private boolean facingRight;
    
    public FuelRobot(int i , boolean fr )
    {
        index = i;
        facingRight = fr;        
    }
    
    public boolean isFacingRight()
    {
        return facingRight;
    }
    
    public void changeDirection()
    {
        facingRight = !facingRight;
    }
    
    public void moveForward( int numLocs )
    {
        if( facingRight )
            index += numLocs;
        else
            index -= numLocs;
    }
    
    public int getCurrentIndex()
    {
        return index;
    }
    
    public String toString()
    {
        return "index = " + index + "    facingRight = " + facingRight ;
    }
}

