import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @author: Theo Lendler
 * @version: 8/26/21
 */
public class Crab extends Actor
{
    // This method repeats the following actions
    public void act()
    {
        move(3);
        turnAtEdge();
        checkKeyPress();
        onCollision();
    }
    // Moves the Crab
  
    // Turns the Crab at the edge
    private void turnAtEdge( )
    {
      if(isAtEdge())
      {
          turn(50);
      }
    
      
    }
    // Checks for user key presses so user can turn the Crab
    private void checkKeyPress( )
    {
    
    }
    // Checks for collisions with other objects  
    private void onCollision( )
    {
      
    }
}


