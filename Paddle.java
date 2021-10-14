import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paddle extends Actor
{
    private String upKey; // A string upkey to tell the paddle to go up
    private String downKey; // A string downkey to tell the paddle to go down
    /**
     * Constructor for Paddle creating an image for it and setting it to go up and down
     */
    public Paddle(String up, String down)
    {
        GreenfootImage whitePaddle = new GreenfootImage(10,100);
        whitePaddle.setColor(Color.WHITE);
        whitePaddle.fill();
        setImage(whitePaddle);
        
        upKey = up;
        downKey = down;
    }
    
    /**
     * General behavior of a Paddle
     */
    public void act()
    {
        paddleMovement();
    }
    
    /**
     * Paddle is able to move up and down with the key words "upKey" and "downkey"
     */
    public void paddleMovement()
    {
        if(Greenfoot.isKeyDown(upKey))
        {
            setLocation(getX(), getY()-4);
        }
        
        if(Greenfoot.isKeyDown(downKey))
        {
            setLocation(getX(), getY()+4);
        }
    }
}