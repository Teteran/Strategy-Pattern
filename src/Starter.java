import Fabryka.FabrykaFigur;
import Fabryka.IFigura;
import Kompozyt.*;
import Dekorator.*;
import Strategia.Pracownik;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kacper on 2017-03-09.
 */
public class Starter {
    public static void main(String[] args) {

        //Strategia();
        //kompozyt();
        //fabryka();
        dekorator();


    }

    private static  void dekorator(){

        DekoratorStarter dekoratorStarter = new DekoratorStarter();
    }


    private static  void fabryka(){
        List<IFigura> figury = new ArrayList<>();

        FabrykaFigur fabryka = new FabrykaFigur();

        Scanner input = new Scanner(System.in);


        while(true) {
            String wybor = input.nextLine();
            switch (wybor) {
                case "pokaz": {
                    for (IFigura figura : figury) {
                        System.out.println(figura.getNazwa());
                    }
                    break;
                }
                default: {
                    figury.add(fabryka.getFigura(wybor));
                }

            }
        }

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


    private static void strategia() {
        Pracownik p1 = new Pracownik("lekarz");
        Pracownik p2 = new Pracownik("lekarz");

        p1.pracuj();
        p2.pracuj();
    }
}
