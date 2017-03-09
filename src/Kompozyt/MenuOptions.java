package Kompozyt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kacper on 2017-03-09.
 */
public class MenuOptions implements IMenuOption {

    List<IMenuOption> menuOptions = new ArrayList<IMenuOption>();

    String name;

    public MenuOptions(String name){ this.name = name; }

    public void addMenuOption(IMenuOption option){
        menuOptions.add(option);
    }


    public void executeOption(int number) {
        menuOptions.get(number).executeOption();
    }



    public void display(){
        System.out.println("|>>>"+name+"<<<|");
        System.out.println("============");
        for(IMenuOption option : menuOptions){
            System.out.println(" "+option.getNameOption());
            System.out.println("------------");
        }

    }


    @Override
    public String getNameOption() {
        return name;
    }

    @Override
    public void executeOption() {
       display();
    }
}
