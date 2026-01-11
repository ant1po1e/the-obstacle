import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rumput2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rumput2 extends Ground
{
    /**
     * Act - do whatever the rumput2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public rumput2()
    {
        GreenfootImage img = getImage();
        img.scale(320,18);
        setImage(img);
    }
}
