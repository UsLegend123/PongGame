import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private int dX = 5; // Ball's speed on going left and right
    private int dY = 3; // Ball's speed on going up and down
    private int timer = 0; // The starting time delay for ball
    /**
     * General behavior of the Pong Ball
     */
    public void act()
    {
        move(); 
        checkForBounce(); 
        checkForTouching(); 
        checkForCollision(); 
        checkForPlayer1();
        checkForPlayer2();
        timer++;
    }
    
    /**
     * Ball is able to move
     */
    public void move()
    {
        if (timer >=100)
        {
            setLocation(getX() + dX, getY() + dY);
        }
    }
    
    /**
     * Ball is able to deflect itself and bounce off the edge
     */
    public void checkForBounce()
    {
        if (getY() <= 0 || getY() >= getWorld().getHeight()-1)
        {
            dY = -dY;
        }
    }
    
    /**
     * Ball is able to deflect itself and bounce off the Paddles
     */
    public void checkForTouching()
    {
        if (isTouching(Paddle.class))
        {
            dX = -dX;
        }
        
        if (getX() >=664 && (isTouching(Paddle.class)))
        {
            dX = 8;
            move();
            dX = 8;
        }
        
        if (getX() <=38 && (isTouching(Paddle.class)))
        {
            dX = 8;
            move();
            dX = -8;
        }
    }
    
    /**
     * Ball does not get stuck in paddle and bounces off the top/bottom of the Paddle
     */
    public void checkForCollision()
    {
        if (isTouching(Paddle.class) && getX() <= 42)
        {
            dX = 10;
            move();
            dX = 5;
        }
        
        if (isTouching(Paddle.class) && getX() >= 661)
        {
            dX = -10;
            move();
            dX = -5;
        }
    }
    
    /**
     * Gives the score to player one and sets the ball at the middle with a timer
     */
    public void checkForPlayer1()
    {
        if (getX() >= 699 || getX() >= getWorld().getWidth()-1)
        {
            setLocation(343,200);
            PongWorld myPongWorld = (PongWorld) getWorld();
            myPongWorld.score1();
            timer = 0;
        }
    }
    
    /**
     * Gives the score to player two and sets the ball at the middle with a timer
     */
    public void checkForPlayer2()
    {
        if (getX() <= 0 || getX() >= getWorld().getWidth()-1)
        {
            setLocation(343, 200);
            PongWorld myPongWorld = (PongWorld) getWorld();
            myPongWorld.score2();
            timer = 0;
        }
    }
}