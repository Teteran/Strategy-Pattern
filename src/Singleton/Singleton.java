package Singleton;

/**
 * Created by Kacper on 2017-04-01.
 */
public class Singleton {

    private static Singleton instance;

    public Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}