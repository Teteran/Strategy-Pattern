package Kompozyt;

/**
 * Created by Kacper on 2017-03-09.
 */
public class MenuOptionAboutUs implements  IMenuOption{

    Application app =null;

    public MenuOptionAboutUs(Application app) {
        if(app == null){
            throw new NullPointerException("Application cannot be null!");
        }
        this.app = app;
    }


    @Override
    public String getNameOption() {
        return "About Us";
    }

    @Override
    public void executeOption() {
        app.aboutUs();
    }
}