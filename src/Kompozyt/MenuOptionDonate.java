package Kompozyt;

/**
 * Created by Kacper on 2017-03-09.
 */
public class MenuOptionDonate implements IMenuOption{
    Application app =null;

    public MenuOptionDonate(Application app) {
        if(app == null){
            throw new NullPointerException("Application cannot be null!");
        }
        this.app = app;
    }


    @Override
    public String getNameOption() {
        return "Donate Us";
    }

    @Override
    public void executeOption() {
        app.donate();
    }
}

