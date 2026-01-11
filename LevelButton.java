import greenfoot.*;

public class LevelButton extends Button
{
    private int level;

    public LevelButton(int level)
    {
        super(
            "level" + level + ".png",
            ""
            );
        this.level = level;
        GreenfootImage img = getImage();
        img.scale(100, 100);    
        setImage(img);
    }

    public void act()
    {
        super.act();

        if (isClicked())
        {
            switch (level)
            {
                case 1:
                    Greenfoot.setWorld(new Level1());
                    break;
                case 2:
                    Greenfoot.setWorld(new Level2());
                    break;
                case 3:
                    Greenfoot.setWorld(new Level3());
                    break;
            }
        }
    }
}
