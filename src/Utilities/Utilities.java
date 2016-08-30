package Utilities;

/**
 * Created by navot on 30/08/2016.
 */
public class Utilities {

    public static void Sleep(int time){

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
