import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rumput here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rumput extends Ground
{
    /**
     * Act - do whatever the rumput wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public rumput()
    {
        GreenfootImage img = getImage();
        img.scale(18,383);
        setImage(img);
    }
}
