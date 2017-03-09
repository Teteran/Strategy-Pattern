package Fabryka;

import java.lang.invoke.WrongMethodTypeException;

/**
 * Created by Kacper on 2017-03-09.
 */
public class FabrykaFigur {

    public IFigura getFigura(String typFigury){

        if (typFigury.equalsIgnoreCase("Kwadrat")){
            System.out.println("Tworze Kwadrat!");
            return new Kwadrat();
        }else if(typFigury.equalsIgnoreCase("Prostokat")){
            System.out.println("Tworze Prostokat!");
            return new Prostokat();
        }

        throw new WrongMethodTypeException("Nie ma takiej figury");
    }
}
