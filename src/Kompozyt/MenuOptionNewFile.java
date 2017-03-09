package Kompozyt;

/**
 * Created by Kacper on 2017-03-09.
 */
public class MenuOptionNewFile implements IMenuOption {

    Application app =null;

    public MenuOptionNewFile(Application app) {
        if(app == null){
            throw new NullPointerException("Application cannot be null!");
        }
        this.app = app;
    }


    @Override
    public String getNameOption() {
        return "New File";
    }

    @Override
    public void executeOption() {
        app.createNewFile();
    }
}


