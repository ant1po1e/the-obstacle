import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trap extends Actor
{
    /**
     * Act - do whatever the Trap wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       if (isTouching(orangnya.class))
        {
            World w = getWorld();

            if (w instanceof Level1)
            {
                ((Level1) w).resetWorld();
            }
            else if (w instanceof Level2)
            {
                ((Level2) w).resetWorld();
            
            }
            else if (w instanceof Level3)
            {
                ((Level3) w).resetWorld();
            
            }
        }
    }
}
