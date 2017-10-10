
/**
 * Write a description of class Coursework here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coursework
{
   Solution solution;

    /**
     * Constructor for objects of class Coursework
     */ 
    
   public Coursework()
   {
       solution = new Solution();
      
   }

   public Solution getSolution(){
       
       return this.solution;
    }
 
}
