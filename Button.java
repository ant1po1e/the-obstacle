import greenfoot.*;

public class Button extends Actor
{
    protected GreenfootImage normal;

    public Button(String normalImg, String hoverImg)
    {
        normal = new GreenfootImage(normalImg);
        setImage(normal);
    }

    public void act()
    {
        setImage(normal);
    }

    public boolean isClicked()
    {
        return Greenfoot.mouseClicked(this);
    }
}
