package Dekorator;

/**
 * Created by Kacper on 2017-02-21.
 */
public class Koszulka extends Produkt {

    Koszulka(){
        produkt="Koszulka ";
    }

    @Override
    double cena() {
        return 35;
    }
}
