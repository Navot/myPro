package Controllers;

/**
 * Created by navot on 29/08/2016.
 */

//is a singleton
public class ViewController {


    private static ViewController instance;

    private ViewController() {
    }

    public static ViewController getInstance() {
        if (instance == null) {
            instance = new ViewController();
        }
        return instance;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    private int X=0;

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    private int Y=0;


}
