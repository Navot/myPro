import Utilities.Utilities;

import java.util.concurrent.Executors;

/**
 * Created by navot on 30/08/2016.
 */
public class Play {
    public static int power=0;
    public static int change=50;
    public static void main(String[] args) {

        Executors.newSingleThreadExecutor().execute(()-> {
            while(true){
                synchronized(Play.class){
                    if(Play.power <100){
                        Play.power=(Play.power+1);

                    }}
                Utilities.Sleep(500);
            }
        });
        Executors.newSingleThreadExecutor().execute( () ->{
            while(true){
                synchronized(Play.class){
                    if (Play.power>10){
                        Play.power=(Play.power-10);

                    }
                }
                Utilities.Sleep((int)(1000* 10*Math.random()));
            }
        });
        Executors.newSingleThreadExecutor().execute(()-> {
            while(true){
                System.out.println(power);
                Utilities.Sleep(100);
            }
        });
    }
}
