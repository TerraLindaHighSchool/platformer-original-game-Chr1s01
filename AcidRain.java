import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AcidRain extends Obstacle
{
    public float yVelocity;
    private final float GRAVITY;
    
    private AcidRain(float gravity)
    {
        GRAVITY = gravity;
    }
    
    public void act()
    {
        fall();
    }
    
    protected void fall()
    {
        yVelocity += GRAVITY;
        setLocation(getX(), getY() + (int) yVelocity);
        removeOutOfBounds(this);
    }
}
