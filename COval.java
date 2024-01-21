public class COval extends CShape // COval is a subclass of CShape
{
   

    public void setHRadius(int l) // Set horizontal radius of shape, also uses isValid to make sure int is between 1-100
    {
        this.setX(isValid(l));
    }
    public void setVRadius(int l) // Set horizontal radius of shape, also uses isValid to make sure int is between 1-100 
    {
        this.setY(isValid(l));
    }
    private int isValid(int n) // This function will validate an int to make sure it is between 1 and 100
    {
        if (0<n && n<=100) return n;
        else return -1;
    }

}