package Controllers;

/**
 * Created by navot on 30/08/2016.
 */
//is a singleton
public class LightController {

    private static LightController instance;

    private LightController() {
    }

    public static LightController getInstance() {
        if (instance == null) {
            instance = new LightController();
        }
        return instance;
    }

    public int getLEVEL() {
        return LEVEL;
    }

    public void setLEVEL(int LEVEL) {
        this.LEVEL = LEVEL;
    }

    private int LEVEL = 0;

}
