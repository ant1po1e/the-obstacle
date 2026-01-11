import greenfoot.*;

public class QuitButton extends Button
{
    public QuitButton()
    {
        super("exitButton.png", "");
        GreenfootImage img = getImage();
        img.scale(75, 75);    
        setImage(img);
    }

    public void act()
    {
        super.act();

        if (isClicked())
        {
            Greenfoot.stop();
        }
    }
}
