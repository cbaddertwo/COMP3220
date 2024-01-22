/**
 * @author Christina Reynolds-Badder
 * 
 * CSquare is a child of the CRectangle class. for a COval to be a CShape, its vertical measurement integer must equal its horizontal measurement integer.
 */
public class CSquare extends CRectangle
{
    /**
     * Overloaded constructor, sets the name of the CShape object
     */

    public CSquare ()
    {
        name = "SQUARE";
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
