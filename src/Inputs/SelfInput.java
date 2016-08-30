package Inputs;

import Controllers.LightController;
import Controllers.ViewController;
import Powers.Power;
import Utilities.Utilities;

/**
 * Created by navot on 30/08/2016.
 */
public class SelfInput implements Runnable{
    Power power = Power.getInstance();
    ViewController view = ViewController.getInstance();
    LightController light = LightController.getInstance();
    int powerLevel=0, x=0, y=0, lightLevel=0;

    @Override
    public void run() {

        while(power.getLEVEL()>10){
            SetSelfInputValues(power.getLEVEL(),view.getX(),view.getY(),light.getLEVEL());
            Utilities.Sleep(10);
        }
    }

    private void SetSelfInputValues(int powerLevel, int x, int y, int lightLevel) {
        this.powerLevel=powerLevel;
        this.x=x;
        this.y=y;
        this.lightLevel=lightLevel;
    }


}
