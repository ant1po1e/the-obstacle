import greenfoot.*;

public class LevelSelect extends World
{
    public LevelSelect()
    {
        super(800, 600, 1);

        addObject(new LevelButton(1), 300, 290);
        addObject(new LevelButton(2), 400, 290);
        addObject(new LevelButton(3), 500, 290);
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BackButton backButton = new BackButton();
        addObject(backButton,83,474);
        backButton.setLocation(81,499);
    }
}
