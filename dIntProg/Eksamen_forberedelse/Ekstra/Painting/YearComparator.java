import java.util.*;
/**
 * Write a description of class YearComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YearComparator implements Comparator<Painting>
{
    public int compare(Painting p1, Painting p2)
    {
        return p1.getYear() - p2.getYear();
    }
}
