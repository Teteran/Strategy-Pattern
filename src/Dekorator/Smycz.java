package Dekorator;

/**
 * Created by Kacper on 2017-02-21.
 */
public class Smycz extends Decorator
{
    Produkt produkt;

    Smycz(Produkt produkt){
        this.produkt = produkt;
    }



    @Override
    String about() {
        return produkt.about() +"+ Smycz ";
    }


    @Override
    double cena() {
        return produkt.cena()+15;
    }
}
