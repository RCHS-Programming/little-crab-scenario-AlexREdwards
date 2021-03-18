import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
     public void act()
    {
       
       
       move();
       LookForCrab();
       randomTurn();
       turnAtEdge();
    }
    
    public void move( )
    {
        move(5);
    }
    
    /*
     * Check whether we have stumbled upon a crab.
     * If we have, eat it. If not, do nothing.
     */
    public void LookForCrab()
    {
        if ( isTouching (Crab.class) )        
       {
           removeTouching (Crab.class);  
           Greenfoot.playSound ("au.wav");
           Greenfoot.stop();
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
