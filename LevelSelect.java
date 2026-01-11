import greenfoot.*;

public class LevelSelect extends World
{
    public LevelSelect()
    {
        super(800, 600, 1);


        addObject(new LevelButton(1), 300, 290);
        addObject(new LevelButton(2), 400, 290);
        addObject(new LevelButton(3), 500, 290);
    }
}
