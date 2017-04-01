package Dekorator;

/**
 * Created by Kacper on 2017-02-21.
 */
public abstract class Produkt {
    String produkt = "produkt bez bonusów";

    String about(){
        return produkt;
    }

    abstract double cena();
}
