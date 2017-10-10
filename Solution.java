import java.util.Random;
/**
 * Write a description of class Solution here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Solution
{
   // instance variables - replace the example below with your own
    private Random rnd;
    private boolean isGood;
    /**
     * Constructor for objects of class Solution
     */
    public Solution()
    {
        rnd = new Random();
        isGood = rnd.nextBoolean();
    }

    public boolean isGood()
    {
       return this.isGood;
    }
    
    public void resetSolution()
    {
       this.isGood = false;
    }
}
