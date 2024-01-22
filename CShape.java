/**
 * @author Christina Reynolds-Badder
 * 
 * Class CShape is an abstract class that provides other classes with a blueprint for a shape object.
 * CShape maintains an x and y variable to hold integer dimensions, which must be a positive integer between 1-100
 * CShape maintains a name string to hold the shapes name
 * CShape maintains a unique ID for the shape object, which must be a positive integer starting from 1
 * CShape maintains a static idCounter to keep track of the unique ID of the shape object
 * ID is auto generated in sequence, starting from 1
 */

public abstract class CShape
{
    protected int x; // horizontal measurement for the shape
    protected int y; // vertical measurement for the shape
    protected String name; // the name of the shape
    private int id; // each shape gets a unique ID number, starting at 1
    private static int idCounter = 0; // shared attribute

    /**
     * CShape overloaded constructor will construct a CShape object, set ID, and increment static IDCounter
     */
    public CShape ()
    {
        id=++idCounter; // auto-increment id counter each time CShape object is created
        
    }

    /**
     * getName returns the stored value of the name CString
     * @return string name of CString object
     */
    public String getName ()
    {
        return this.name;
    }

    /**
     * setX sets the x of the CShape object
     * @param x int X to represent the horizontal measurement of the CShape object
     */
    public void setX(int x)
    {
        if (isValidNumber(x)) this.x = x;
    }

    /**
     * getX returns the x of the CShape object
     * @return int X to represent horizontal measurement of the CShape object
     */
    public int getX()
    {
        return this.x;
    }

    /**
     * setY sets the y of the CShape object
     * @param y int y to represent the vertical measurement of the CShape object
     */
    public void setY(int y)
    {
        if (isValidNumber(y)) this.y = y;
    }

    /**
     * getY returns the y of the CShape object
     * @return int y to represent vertical measurement of the CShape object
     */
    public int getY()
    {
        return this.y;
    }

    /**
     * isValidNumber verifies that integer x is between 1-100, returns true if the value meets the requirements
     * @param x integer to verify is between 1-100
     * @return true if x meets requirements ; false if otherwise
     */
    private boolean isValidNumber(int x)
    {
        if (0<x && x<=100) return true;
        else return false;
    }

    /**
     * toString override returns a string output of the object instance
     * @return the formatted string output to display attributes of CShape object
     */
    public String toString()
    {
        return ("Shape " + this.id + ": " + this.name + " " + this.x + "x" + this.y);
    }
}
