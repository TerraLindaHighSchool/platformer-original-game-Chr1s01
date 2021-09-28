import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @Chris Hubbell 
 * @version 9/28/21 v1.3.6
 */
public class Level1 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3"
    );
    /**
     */
    public Level1()
    {
        super(1200, 800, 1, false);
        prepare();
    }
    
    public void act()
    {
        spawn();
    }
    
    private void prepare()
    {
        setPaintOrder(Player.class, Platform.class, Obstacle.class, 
            Collectable.class, Door.class, HUD.class);
        Door door = new Door();
        addObject(door,1171,44);
        Player player = new Player();
        addObject(player,96,750);
        addObject(new Floor(), 600, 800);
        addObject(new BrickWall(), 380, 500);
        addObject(new BrickWall(), 780, 300);
        addObject(new BrickWall(), 960, 100);
        addObject(new SmBrickWall(), 1120, 600);
        addObject(new SmBrickWall(), 880, 600);
        addObject(new SmBrickWall(), 420, 160);
        addObject(new SmBrickWall(), 1000, 200);
        addObject(new SmBrickWall(), 220, 280);
        addObject(new TrapDoor(GRAVITY), 60, 400);
        addObject(new TrapDoor(GRAVITY), 1000, 600);
        addObject(new Bomb(GRAVITY), 455,114);
        addObject(new Bomb(GRAVITY), 1160, 544);
        addObject(new Gem(), 975, 160);
        addObject(new Gem(), 1030, 160);

    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
