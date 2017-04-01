package Dekorator;

/**
 * Created by Kacper on 2017-02-21.
 */
public class Pendrive extends Decorator {
    private Produkt produkt;


    Pendrive(Produkt produkt){
        this.produkt = produkt;
    }



    @Override
    String about() {
        return produkt.about() +"+ Pendrive ";
    }

    @Override
    double cena() {
        return produkt.cena()+5;
    }
}
