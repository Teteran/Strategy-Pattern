package Kompozyt;

/**
 * Created by Kacper on 2017-03-09.
 */
public class MenuOptionSave implements IMenuOption {

    Application app =null;

    public MenuOptionSave(Application app) {
        if(app == null){
            throw new NullPointerException("Application cannot be null!");
        }
        this.app = app;
    }


    @Override
    public String getNameOption() {
        return "Save File";
    }

    @Override
    public void executeOption() {
        app.saveFile();
    }
}
