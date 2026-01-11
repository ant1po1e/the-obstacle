import greenfoot.*;

public class orangnya extends Actor
{
    // ================= GERAK =================
    private int speed = 4;
    private int vSpeed = 0;
    private int gravity = 1;
    private int jumpPower = -15;
    private boolean onGround = false;
    private boolean moving = false;

    // ================= ANIMASI =================
    private GreenfootImage[] walk = new GreenfootImage[10];
    private GreenfootImage idle;
    private GreenfootImage jump;

    private int frame = 0;
    private int animDelay = 0;

    // ================= STATE =================
    private enum State { IDLE, WALK, JUMP }
    private State state = State.IDLE;

    private boolean facingRight = true;

    public orangnya()
    {
        for (int i = 0; i < walk.length; i++)
        {
            walk[i] = new GreenfootImage("walk" + (i + 1) + "a.png");
            walk[i].scale(walk[i].getWidth() / 20, walk[i].getHeight() / 20);
        }

        idle = new GreenfootImage("idle.gif"); // ⬅️ WAJIB PNG
        idle.scale(idle.getWidth() / 8, idle.getHeight() / 8);

        jump = new GreenfootImage("jump.png");
        jump.scale(jump.getWidth() * 3 / 2, jump.getHeight() * 3 / 2);

        setIdle();
    }

    public void act()
    {
        moveHorizontal();
        jump();
        applyGravity();
        updateAnimation();
    }

    // ================= GERAK =================
    private void moveHorizontal()
    {
        int dx = 0;
        moving = false;

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
                setLocation(getX() - dx, getY());
            }
            else
            {
                moving = true;
            }
        }
    }

    private void jump()
    {
        if (onGround && Greenfoot.isKeyDown("up"))
        {
            vSpeed = jumpPower;
            onGround = false;
        }
    }

    private void applyGravity()
    {
        vSpeed += gravity;
        setLocation(getX(), getY() + vSpeed);

        if (isTouching(Ground.class))
        {
            if (vSpeed > 0) onGround = true;
            vSpeed = 0;

            while (isTouching(Ground.class))
                setLocation(getX(), getY() - 1);
        }
        else
        {
            onGround = false;
        }
    }

    // ================= ANIMASI =================
    private void updateAnimation()
    {
        if (!onGround)
        {
            if (state != State.JUMP)
                setJump();
            return;
        }

        if (moving)
        {
            if (state != State.WALK)
                setWalk();

            animateWalk();
        }
        else
        {
            if (state != State.IDLE)
                setIdle();
        }
    }

    private void animateWalk()
    {
        animDelay++;

        if (animDelay >= 5)
        {
            animDelay = 0;
            frame = (frame + 1) % walk.length;

            GreenfootImage img = new GreenfootImage(walk[frame]);
            if (!facingRight) img.mirrorHorizontally();
            setImage(img);
        }
    }

    // ================= STATE SETTER =================
    private void setIdle()
    {
        state = State.IDLE;
        frame = 0;
        animDelay = 0;

        GreenfootImage img = new GreenfootImage(idle);
        if (!facingRight) img.mirrorHorizontally();
        setImage(img);
    }

    private void setWalk()
    {
        state = State.WALK;
        frame = 0;
        animDelay = 0;
    }

    private void setJump()
    {
        state = State.JUMP;

        GreenfootImage img = new GreenfootImage(jump);
        if (!facingRight) img.mirrorHorizontally();
        setImage(img);
    }
}
