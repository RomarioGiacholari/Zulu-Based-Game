
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    // instance variables - replace the example below with your own
    private int energy;
    private int score = 0;
    private Room location;

    /**
     * Constructor for objects of class Player
     */
    public Player(Room location)
    {
        // initialise instance variables
        resetEnergy();
        this.location = location;
    }
    
    public Room getLocation() {
        return location;
    }
    
    public void leave() {
        location.leave();
    }
    
    public void setLocation(Room newLocation) {
        location = newLocation;
        location.enter(this);
    }
    
    public void decreaseEnergy() {
        energy--;
    }
    
    public void incrementEnergy() {
        this.energy += 2;
    }
    
    public int getEnergyLevel() {
        return energy;
    }
    
    public boolean isAlive() {
        return energy > 0;
    }
    
    public void resetEnergy() {
        energy = 10;
    }
    
    public int getScore() {
        return this.score;
    }
    
    public void incrementScore() {
        this.score ++;
    }

}
