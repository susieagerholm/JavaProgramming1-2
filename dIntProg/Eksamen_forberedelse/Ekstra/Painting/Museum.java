
/**
 * Write a description of class Museum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Museum
{
    private String museumName;    
    private ArrayList<Painting> paintings;
    
    /**
     * Constructor for objects of class Museum
     */
    public Museum(String m)
    {
        museumName = m;
        paintings = new ArrayList<Painting>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(Painting p){
        paintings.add(p);
    }
    
    /**
     * 
     */
    public void remove(Painting p){
        paintings.remove(p);
    }
    
    /**
     * 
     */
    
    public Painting oldestPainting()
    {
        return Collections.min(paintings, new YearComparator());
    }    
    
    /**
     * 
     */
    public Painting mostExpensive()
    {
        return Collections.max(paintings, new ValueComparator());
    }
}
