import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dad extends Actor
{
    // This method repeats the following actions
    public void act()
    {
        move(3);
        turnAtEdge();
        turnAtHouse();

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
    
    public void turnAtHouse( )
    {
        if(isTouching(House.class))
        {
            turn(30);
        }
    
    }
}