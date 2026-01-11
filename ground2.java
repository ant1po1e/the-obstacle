import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ground2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ground2 extends Ground
{
    /**
     * Act - do whatever the ground2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ground2()
    {
        GreenfootImage img = getImage();
        img.scale(70, 100);
        setImage(img);
    }
}
