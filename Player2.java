import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends Actor
{
    private int score; // The score number for player two
    private GreenfootImage image; // Ending image for player two
    /**
     * Constructor for player two telling the score and setting the score
     */
    public Player2()
    {
        score = 0;
        setImage(new GreenfootImage (200, 30));
        player2();
        image = new GreenfootImage ("Player2.png");
    }
    
    /**
     * Adds a score to player two if they score and checks if player two wins
     */
    public void addScore()
    {
        score++;
        player2();
        checkForWin();
    }
    
    /**
     * Adds a score image for player two and contains the score number
     */
    public void player2()
    {
        GreenfootImage player2 = getImage();
        player2.clear();
        player2.setColor(Color.WHITE);
        player2.drawString("Player 2: "+ score, 4, 20);
    }
    
    /**
     * Checks for win if score is at eight and ends the game
     * Sets the ending image for player two
     */
    public void checkForWin()
    {
        if (score >=8)
        {
            Greenfoot.stop();
            setImage(image);
            setLocation(350, 200);
        }
        if (isTouching(Player1.class))
        {
            removeTouching(Player1.class);
        }
    }
}
