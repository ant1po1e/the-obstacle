import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kayu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kayu extends Ground
{
    /**
     * Act - do whatever the kayu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public kayu()
    {
        GreenfootImage img = getImage();
        img.scale(60, 10);
        setImage(img);
    }
}
