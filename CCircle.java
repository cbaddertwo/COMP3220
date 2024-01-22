/**
 * @author Christina Reynolds-Badder
 * 
 * CCircle is a child of the COval class. for a COval to be a CShape, its vertical measurement integer must equal its horizontal measurement integer.
 */
public class CCircle extends COval
{
    /**
     * Overloaded constructor, sets the name of the CShape object
     */
    public CCircle ()
    {
        name = "CIRCLE";
    }

    /**
     * toString override returns a string output of the object instance
     * @return the formatted string output to display attributes of CShape object
     */
    public String toString()
    {
        return ("Shape " + this.id + ": " + this.name + " " + this.x);
    }
}
