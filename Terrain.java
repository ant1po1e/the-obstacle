import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Terrain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Terrain extends Ground
{
    /**
     * Act - do whatever the Terrain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Terrain()
    {
        GreenfootImage img = getImage();
        img.scale(80, 80);
        setImage(img);
    }
}
