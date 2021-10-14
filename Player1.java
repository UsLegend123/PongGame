import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Actor
{
    private int score; // The score number for player one
    private GreenfootImage image; // Ending image for player one
    /**
     * Constructor for player one telling the score and setting the score
     */
    public Player1()
    {
        score = 0;
        setImage(new GreenfootImage (200, 30));
        player1();
        image = new GreenfootImage ("Player1.png");
    }
    
    /**
     * Adds a score to player one if they score and checks if player one wins
     */
    public void addScore()
    {
        score++;
        player1();
        checkForWin();
    }
    
    /**
     * Adds a score image for player one and contains the score number
     */
    public void player1()
    {
        GreenfootImage player1 = getImage();
        player1.clear();
        player1.setColor(Color.WHITE);
        player1.drawString("Player 1: "+ score, 4, 20);
    }
    
    /**
     * Checks for win if score is at eight and ends the game
     * Sets the ending image for player one
     */
    public void checkForWin()
    {
        if (score >=8)
        {
            Greenfoot.stop();
            setImage(image);
            setLocation(350, 200);
        }
        if (isTouching(Player2.class))
        {
            removeTouching(Player2.class);
        }
    }
}
