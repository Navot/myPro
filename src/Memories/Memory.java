package Memories;

/**
 * Created by navot on 30/08/2016.
 */
public class Memory {

    private static Memory singleton = new Memory( );

    private Memory(){ }

    public static Memory getInstance( ) {
        return singleton;
    }

    protected static void demoMethod( ) {
        System.out.println("demoMethod for Memory singleton");
    }


}
