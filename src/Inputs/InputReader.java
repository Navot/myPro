package Inputs;

import Utilities.Utilities;

import java.util.concurrent.Executors;

/**
 * Created by navot on 30/08/2016.
 */

public class InputReader implements Runnable{

    @Override
    public void run() {
        Executors.newSingleThreadExecutor().execute(()-> {
           //Reading SelfInput


        });

        Executors.newSingleThreadExecutor().execute(()-> {
            //Reading ExternalInput


        });
    }
}
