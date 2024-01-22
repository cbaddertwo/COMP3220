/**
 * @author Christina Reynolds-Badder
 * 
 * CDriver is the holder of the main method, responsible for creating a CCanvas image, then displaying its toString() to the console.
 */
public class CDriver {
/**
 * The main method is responsible for creating a CCanvas image, then printing CCanvas.toString() to the console.
 * @param args The command line arguments
 */
    public static void main(String [] args)
    {
        CCanvas canvas = new CCanvas();
        System.out.println(canvas);
    }
}
