import greenfoot.*;

public class orangnya extends Actor
{
    public int score = 0;
    
    public void addScore(int amount)
    {
        score += amount;
    }
    
    public int getScore()
    {
        return score;
    }

    // ================= GERAK =================
    private int speed = 4;
    private int vSpeed = 0;
    private int gravity = 1;
    private int jumpPower = -15;

    private boolean onGround = false;
    private boolean facingRight = true;

    // ================= ANIMASI =================
    private GreenfootImage[] walk = new GreenfootImage[10];
    private GreenfootImage[] idle = new GreenfootImage[10];
    private GreenfootImage jump;

    private int frame = 0;
    private int animDelay = 0;

    private enum State { IDLE, WALK, JUMP }
    private State state = State.IDLE;

    public orangnya()
    {
        // WALK
        for (int i = 0; i < 10; i++)
        {
            walk[i] = new GreenfootImage("walk" + (i + 1) + "a.png");
            walk[i].scale(walk[i].getWidth() / 20, walk[i].getHeight() / 20);
        }

        // IDLE (10 FRAME)
        for (int i = 0; i < 10; i++)
        {
            idle[i] = new GreenfootImage("idle" + (i + 1) + ".png");
            idle[i].scale(idle[i].getWidth() / 20, idle[i].getHeight() / 20);
        }

        jump = new GreenfootImage("jump.png");
        jump.scale(jump.getWidth() * 3 / 2, jump.getHeight() * 3 / 2 );

        setImage(idle[0]);
    }

    public void act()
    {
        moveHorizontal();
        jump();
        applyGravity();
        updateAnimation();
    }

    // ================= GERAK HORIZONTAL =================
    private void moveHorizontal()
    {
        int dx = 0;

        if (Greenfoot.isKeyDown("right"))
        {
            dx = speed;
            facingRight = true;
        }
        else if (Greenfoot.isKeyDown("left"))
        {
            dx = -speed;
            facingRight = false;
        }

        if (dx != 0)
        {
            setLocation(getX() + dx, getY());

            if (isTouching(Ground.class))
            {
                setLocation(getX() - dx, getY()); // batalin gerak
            }
        }
    }

    // ================= LOMPAT =================
    private void jump()
    {
        if (onGround && Greenfoot.isKeyDown("up"))
        {
            vSpeed = jumpPower;
            onGround = false;
        }
    }

    // ================= GRAVITASI =================
    private void applyGravity()
    {
        vSpeed += gravity;
        setLocation(getX(), getY() + vSpeed);

        if (isTouching(Ground.class))
        {
            if (vSpeed > 0)
            {
                onGround = true;
                vSpeed = 0;

                while (isTouching(Ground.class))
                    setLocation(getX(), getY() - 1);
            }
        }
        else
        {
            onGround = false;
        }
    }

    // ================= ANIMASI =================
    private void updateAnimation()
    {
        animDelay++;

        if (!onGround)
        {
            setState(State.JUMP);
            return;
        }

        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("right"))
        {
            setState(State.WALK);
            animate(walk);
        }
        else
        {
            setState(State.IDLE);
            animate(idle);
        }
    }

    private void animate(GreenfootImage[] images)
    {
        if (animDelay >= 6)
        {
            animDelay = 0;
            frame = (frame + 1) % images.length;

            GreenfootImage img = new GreenfootImage(images[frame]);
            if (!facingRight) img.mirrorHorizontally();
            setImage(img);
        }
    }

    private void setState(State newState)
    {
        if (state != newState)
        {
            state = newState;
            frame = 0;
            animDelay = 0;

            if (state == State.JUMP)
            {
                GreenfootImage img = new GreenfootImage(jump);
                if (!facingRight) img.mirrorHorizontally();
                setImage(img);
            }
        }
    }
}
