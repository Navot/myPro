package Powers;

import Controllers.LightController;
import Utilities.Utilities;

import java.util.concurrent.Executors;

/**
 * Created by navot on 30/08/2016.
 */
//is a singleton
public class Power implements Runnable{

    private static Power instance;

    private Power() {
    }

    public static Power getInstance() {
        if (instance == null) {
            instance = new Power();
        }
        return instance;
    }

    private int LEVEL=0;

    public int getLEVEL() {
        return LEVEL;
    }

    public void setLEVEL(int LEVEL) {
        this.LEVEL = LEVEL;
    }

    @Override
    public void run() {
        Executors.newSingleThreadExecutor().execute(()-> {
                while(true) {
                    synchronized (Power.class) {
                        if (Power.getInstance().getLEVEL() < 100) {
                            Power.getInstance().setLEVEL(Power.getInstance().getLEVEL() + 1);
                        }
                    }
                    Utilities.Sleep(5000);
                }
        });
        Executors.newSingleThreadExecutor().execute( () ->{
                while(true){
                    synchronized (Power.class) {
                        if (LightController.getInstance().getLEVEL() > 0 && Power.getInstance().getLEVEL() >0) {
                            Power.getInstance().setLEVEL(Power.getInstance().getLEVEL() - 1);
                        }
                    }
                    Utilities.Sleep(10000 / LightController.getInstance().getLEVEL());
                }
        });


    }

}