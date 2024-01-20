public class CRectangle extends CShape
    {
        public void setWidth(int l) // Set width of shape, also uses isValid to make sure int is between 1-100
        {
            this.x = isValid(l);
        }
        public void setLength(int l) // Set length of shape, also uses isValid to make sure int is between 1-100 
        {
            this.y = isValid(l);
        }
        private int isValid(int n) // This function will validate an int to make sure it is between 1 and 100
        {
            if (0<n && n<=100) return n;
            else return -1;
        }
    }