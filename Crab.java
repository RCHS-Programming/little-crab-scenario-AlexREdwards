import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
       
       
       move();
       LookForWorm();
       randomTurn();
       turnAtEdge();
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
       }
    }
    
    public void randomTurn()
    {
        if ( Greenfoot.getRandomNumber(100) < 10 )                 
       {
           turn( Greenfoot.getRandomNumber(91) - 45);                
       }
    }
    
    public void turnAtEdge()
    {
        if ( isAtEdge() ) 
       {
           turn(17);
       }
    }
}


