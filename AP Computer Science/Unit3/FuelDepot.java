//Lab 17
package Unit3;
import java.util.ArrayList;
import java.util.*;
public class FuelDepot
{
    private FuelRobot filler;
    private ArrayList<FuelTank> tanks;
    public FuelDepot( FuelRobot fr ,ArrayList<FuelTank> t )
    {
        filler = fr;
        tanks = t;
    }           
    /**
     * Determines and returns the index of the next tank to be filled.
     * @param  threshold  fuel tanks with a fuel level <= threshold may be filled
     * @return  index of the location of the next tank to be filled
     * PostCondition: The state of the robot has not changed
     */
    public int nextTankToFill( int threshold )
    {
        int next = 0;
        for(int i = 1; i < tanks.size();i++)
        {
            if((tanks.get(i).getFuelLevel()) < tanks.get(next).getFuelLevel())
            {
                next = i;
            }            
        }
        return next;
    }
    /**
     * Moves the robot to location locIndex
     * @param  locIndex  the index of the location of the tank to move to
     *      Precondition:   0 <= locIndex < tanks.size()
     * PostCondition: the current location of the robot is locIndex
     */
    public void moveToLocation( int locIndex )
    {
        if (locIndex == filler.getCurrentIndex())
        return;
        
        if ((locIndex < filler.getCurrentIndex() && filler.isFacingRight())
        || (locIndex > filler.getCurrentIndex() && !filler.isFacingRight()))
        filler.changeDirection();

        filler.moveForward(Math.abs(locIndex - filler.getCurrentIndex()));
    }
    
}
    
    
    
    
    
    
    