import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PongWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PongWorld extends World
{
    private Player1 player1; // Player one variable to create object
    private Player2 player2; // Player two variable to create object
    /**
     * Constructor for PongWorld and creates/locates objects of class PongWorld.
     */
    public PongWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1);
        
        player1 = new Player1();
        addObject (player1, getWidth()-565, getHeight()-365);
        
        player2 = new Player2();
        addObject (player2, getWidth()-5, getHeight()-365);
        
        addObject(new Ball(), getWidth()-357, getHeight()/2);
        
        addObject(new Paddle("w","s"), getWidth()-675, getHeight()/2);
        
        addObject(new Paddle("up","down"), getWidth()-25, getHeight()/2);
    }
    
    /**
     * Connects to the player one method "addScore" and adds a score to player one
     */
    public void score1()
    {
        player1.addScore();
    }
    
    /**
     * Connects to the player two method "addScore" and adds a score to player two
     */
    public void score2()
    {
        player2.addScore();
    }
}