import greenfoot.*;

public class PlayButton extends Button
{
    public PlayButton()
    {
        super("playButton.png", "");
        GreenfootImage img = getImage();
        img.scale(100, 100);    
        setImage(img);
    }

    public void act()
    {
        super.act();

        if (isClicked())
        {
            Greenfoot.setWorld(new LevelSelect());
        }
    }
}
