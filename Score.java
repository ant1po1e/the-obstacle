import greenfoot.*;

public class Score extends Actor
{
    protected int value = 1;

    public void act()
    {
        orangnya player = (orangnya) getOneIntersectingObject(orangnya.class);

        if (player != null)
        {
            player.addScore(value);
            getWorld().removeObject(this);
        }
    }
}
