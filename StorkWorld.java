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
        addObject(crab,200,283);
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
        addObject(lobster,41,272);
        House house = new House();
        addObject(house,470,261);
        house.setLocation(484,279);
        removeObject(house);
        addObject(house,412,284);
        House house2 = new House();
        addObject(house2,60,61);
        House house3 = new House();
        addObject(house3,229,86);
        House house4 = new House();
        addObject(house4,381,502);
        House house5 = new House();
        addObject(house5,404,96);
        House house6 = new House();
        addObject(house6,74,463);
        house6.setLocation(156,368);

        house6.setLocation(129,410);
        house.setLocation(482,320);
        house5.setLocation(442,171);
        house3.setLocation(243,88);
        Baby baby = new Baby();
        addObject(baby,425,63);
        Baby baby2 = new Baby();
        addObject(baby2,458,440);
        Baby baby3 = new Baby();
        addObject(baby3,207,494);
        Baby baby4 = new Baby();
        addObject(baby4,106,186);
        Baby baby5 = new Baby();
        addObject(baby5,40,408);
        Baby baby6 = new Baby();
        addObject(baby6,463,258);
        house5.setLocation(313,269);
        house5.setLocation(262,360);
        house6.setLocation(159,414);
        house.setLocation(515,155);
        house4.setLocation(369,516);
        house5.setLocation(357,331);
        house.setLocation(512,208);
        house5.setLocation(365,326);
        house5.setLocation(340,363);
        house5.setLocation(380,350);
        house.setLocation(513,151);
        house5.setLocation(367,297);
        house5.setLocation(364,308);
        house.setLocation(506,197);
        house5.setLocation(372,340);
        house5.setLocation(384,352);
        removeObject(house5);
    }
}