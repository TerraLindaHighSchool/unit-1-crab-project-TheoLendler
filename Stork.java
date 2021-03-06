import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @author: Theo Lendler
 * @version: 8/26/21
 */
public class Stork extends Actor
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
      if(Greenfoot.isKeyDown("right"))
      {
          turn(4);
      }
     
      if(Greenfoot.isKeyDown("left"))
      {
          turn(-4);
      }
 
    }
    // Checks for collisions with other objects  
    private void onCollision( )
    {
      if(isTouching(Baby.class))
      {
          removeTouching(Baby.class);
          // Winning the game
          if(getWorld().getObjects(Baby.class).size() == 0)
          {
              Greenfoot.setWorld(new WinSplash());
              Greenfoot.playSound("fanfare.wav");
              Greenfoot.stop();
          }
      }
      if(isTouching(House.class))
      {
          Greenfoot.setWorld(new LoseSplash());
          Greenfoot.playSound("au.wav");
          Greenfoot.stop();
      }
       if(isTouching(Dad.class))
      {
          Greenfoot.setWorld(new TwoLoseSplash());
          Greenfoot.playSound("au.wav");
          Greenfoot.stop();
      }
    }
}


