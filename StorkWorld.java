import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class StorkWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public StorkWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Stork crab = new Stork();
        addObject(crab,194,242);
        Baby worm = new Baby();
        addObject(worm,305,443);
        Baby worm2 = new Baby();
        addObject(worm2,372,191);
        Baby worm3 = new Baby();
        addObject(worm3,91,119);
        Baby worm4 = new Baby();
        addObject(worm4,511,55);
        Baby worm5 = new Baby();
        addObject(worm5,493,398);
        Baby worm6 = new Baby();
        addObject(worm6,108,498);
        Baby worm7 = new Baby();
        addObject(worm7,60,370);
        Baby worm8 = new Baby();
        addObject(worm8,350,112);
        Dad lobster = new Dad();
        addObject(lobster,316,350);
    }
}