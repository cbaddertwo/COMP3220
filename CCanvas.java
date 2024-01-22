import java.util.Random;

/**
 * @author Christina Reynolds-Badder
 * 
 * CCanvas class creates a CCanvas object that includes a CShape factory method, a random number method, a method that creates an array of 10 CShapes and checks for duplicates,
 * and a custom toString method to create a display String.
 */

public class CCanvas 
{

    /**
     * getRandomNum returns a random integer from 1-max using the Random class from java.util
     * @param max is an integer that represents the maximum number that can be given
     * @return a randomized integer from 1-max
     */

    public int getRandomNum(int max)
    {
        Random r = new Random();
        return r.nextInt(max+1);
    }

    /**
     * shapeFactory is a utilizes the getRandomNum() method to generate a CShape object; it also assigns a randomized x and y integer measurement to the shape, and returns
     * the created shape.
     * @return a CShape object with its subclass, x and y all randomized
     */
    public CShape shapeFactory()
    {
        int rand = getRandomNum(1); // generates random integer from 0-1; if it's 1, the factory will create a CRectangle object; if it's 0, it will create a COval object

        int x = getRandomNum(100); // random x integer from 0-100
        int y = getRandomNum(100); // random y integer from 0-100
        if (x==y) // if x=y, the factory creates a CCircle or CSquare. Else, it creates a COval or CRectangle.
        {
            if (rand==0) 
            {
                COval i = new CCircle(); // create new CCircle object
                i.setX(x); // set horizontal radius of CCircle
                i.setY(y); // sets vertical radius of CCircle
                return i; // returns CCircle object
            } 
            //else return new CSquare();
            else
            {
                CRectangle i = new CSquare();
                i.setX(x);
                i.setY(y);
                return i;
            } 
        }
        else {
            //if (rand==0) return new COval();
            //else return new CRectangle();
            if (rand==0)
            {
                COval i = new COval();
                i.setX(x);
                i.setY(y);
                return i;
            } 
            //else return new CSquare();
            else
            {
                CRectangle i = new CRectangle();
                i.setX(x);
                i.setY(y);
                return i;
            }
        }
    }

    /**
     * get10RandomShapes returns an array of 10 non-duplicate CShape objects
     * @return randShapes[] a CShape array with the size of 10, to hold random shapes
     */
    public CShape [] get10RandomShapes()
    {
        CShape randShapes [] = new CShape[10];

        int counter = 0;

        for (int i=0; i<10; i++) // create the shape
        {
            randShapes[i] = shapeFactory(); // get a new random shape

            for (int x=counter; x>=0; x--) // compare this shape with all other shapes, make sure none are duplicates
            {
                if (i!=x) // making sure we're not comparing the same object
                {
                    while ((randShapes[i].getX() == randShapes[x].getX()) && (randShapes[i].getY() == randShapes[x].getY()) && (randShapes[i].getName() == randShapes[x].getName())) // continues making new shape until it is not a duplicate
                    {
                        randShapes[i] = shapeFactory(); // get a new random CShape object
                    }
                }
            }
            counter++; // increment counter when CShape is done being assignet to randShapes[]
        }
        return randShapes; // return array of 10 randomized and non-duplicate CShape objects
    }

    /**
     * toString() overrides the default toString method to properly display the 10 randomly generated shapes
     */

    public String toString()
    {
        CShape randShapes [] = get10RandomShapes(); // get an array of 10 random CShape objects using get10RandomShapes()

        String r = ">> Canvas has the following random shapes:\n\n"; // string r is the string to be returned

        for (int i=0; i<10; i++)
        {
            r = r+randShapes[i].toString() + "\n\n"; // adding all 10 shapes to the String r
        }
        return r; // return properly formatted string
    }
    
}
