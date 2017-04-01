package Dekorator;

/**
 * Created by Kacper on 2017-02-21.
 */
public class Kubek extends Produkt{

    Kubek(){
        produkt="Kubek ";
    }

    @Override
    double cena() {
        return 25;
    }
}
