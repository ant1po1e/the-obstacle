import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spikedball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spikedball extends Trap
{
    /**
     * Act - do whatever the spikedball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act();
        turn(5);
    }
    
    public spikedball()
    {
        GreenfootImage img = getImage();
        img.scale(58,58);
        setImage(img);
    }
}
