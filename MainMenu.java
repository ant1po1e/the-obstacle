import greenfoot.*;

public class MainMenu extends World
{
    public MainMenu()
    {    
        super(800, 600, 1);
        
        Level2 w = new Level2();
        Greenfoot.setWorld(w);
        
        GreenfootImage title = new GreenfootImage("gameTitle.png");
        GreenfootImage creds = new GreenfootImage("credsTitle.png");
        title.scale(510, 50);
        creds.scale(357, 35);
        Actor titleActor = new Actor(){};
        titleActor.setImage(title);
        Actor credsActor = new Actor(){};
        credsActor.setImage(creds);

        addObject(titleActor, 400, 150);
        addObject(credsActor, 400, 195);
        
        addObject(new PlayButton(), 400, 290);
        addObject(new QuitButton(), 400, 400);
    }
}
