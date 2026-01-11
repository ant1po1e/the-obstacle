import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class balok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class balok extends Ground
{
    /**
     * Act - do whatever the balok wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public balok()
    {
        GreenfootImage img = getImage();
        img.scale(35, 35);
        setImage(img);
    }
}
