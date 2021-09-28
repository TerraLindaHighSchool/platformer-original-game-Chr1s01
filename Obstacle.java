import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle here.
 * 
 * @author Chris Hubbell 
 * @version 1.3.1 
 */
public abstract class Obstacle extends Actor
{
    protected abstract void fall();
    
    protected boolean isOnGround()
    {    
        // Returns true if the child object is on the ground,
        // false otherwise
        
        {
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight() / 2, 
                                                        Platform.class);
            return ground != null;
        }
    }
        
        // Some child objects fall. This method removes the object
        // once it is out of bounds
    protected void removeOutOfBounds(Obstacle obstacle)
    {
        if(obstacle.getY() > 
            getWorld().getHeight() + obstacle.getImage().getWidth() / 2)
        {
                getWorld().removeObject(obstacle);
        }
    }
    }
