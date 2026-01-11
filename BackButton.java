import greenfoot.*;

public class BackButton extends Button
{
    public BackButton()
    {
        super("backButton.png", "");
        GreenfootImage img = getImage();
        img.scale(100, 100);    
        setImage(img);
    }

    public void act()
    {
        super.act();

        if (isClicked())
        {
            Greenfoot.setWorld(new MainMenu());
        }
    }
}
