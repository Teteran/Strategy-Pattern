package Kompozyt;

import static java.lang.Thread.sleep;

/**
 * Created by Kacper on 2017-03-09.
 */
public class Application {

    public String filename;

    public Application(String filename){ this.filename = filename; }

    public void createNewFile() {
        System.out.println("\nExecuting...");
        try {
            sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("New File has been created!");
    }

    public void saveFile() {
        System.out.println("\nExecuting...");
        try {
            sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("New File has been saved!");
    }

    public void aboutUs() {
        System.out.println("\nExecuting...");
        try {
            sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Author: K.T. :)");
    }

    public void donate() {
        System.out.println("\nExecuting...");
        try {
            sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Donating 10000$");
    }
}
