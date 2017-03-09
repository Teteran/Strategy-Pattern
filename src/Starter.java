import Kompozyt.*;
import Strategia.Pracownik;

/**
 * Created by Kacper on 2017-03-09.
 */
public class Starter {
    public static void main(String[] args) {

        //Strategia();
        kompozyt();


    }

    private static void kompozyt() {
        String file = "pliczek.txt";
        Application app = new Application(file);

        MenuOptions menu1 = new MenuOptions("FILE");
        MenuOptions menu2 = new MenuOptions("HELP");

        IMenuOption saveOption = new MenuOptionSave(app);
        IMenuOption newFileOption = new MenuOptionNewFile(app);
        IMenuOption aboutUsOption = new MenuOptionAboutUs(app);
        IMenuOption donateOption = new MenuOptionDonate(app);

        menu1.addMenuOption(saveOption);
        menu1.addMenuOption(newFileOption);
        menu1.addMenuOption(menu2);
        menu2.addMenuOption(aboutUsOption);
        menu2.addMenuOption(donateOption);

        menu1.display();
        menu1.executeOption(2);
        menu2.executeOption(1);

    }


    private static void Strategia() {
        Pracownik p1 = new Pracownik("lekarz");
        Pracownik p2 = new Pracownik("lekarz");

        p1.pracuj();
        p2.pracuj();
    }
}
