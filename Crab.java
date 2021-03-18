import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
       
       checkKeyPress();
       move();
       LookForWorm();
       
       
    }
    
    public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("left"))
       {
           turn (-4);
       }
        if (Greenfoot.isKeyDown("right"))
        {
            turn (4);
        }
    }
    
    public void move( )
    {
        move(5);
    }
    
    /*
     * Check whether we have stumbled upon a worm.
     * If we have, eat it. If not, do nothing.
     */
    public void LookForWorm()
    {
        if ( isTouching (Worm.class) )        
       {
           removeTouching (Worm.class);     
           Greenfoot.playSound ("slurp.wav");
       }
    }
    
    
    
   
}


