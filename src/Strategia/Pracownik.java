package Strategia;

/**
 * Created by Kacper on 2017-03-08.
 */
public class Pracownik {


    IPraca praca;
    ITransport transport;

    public Pracownik(String zawod){

        if(zawod.equalsIgnoreCase("lekarz")) {
            praca = new Leczenie();
            transport = new Samochod();
        }
        else if(zawod.equalsIgnoreCase("piekarz")){
            praca = new Piecz();
            transport = new Tramwaj();
        }
    }

    public void pracuj(){
        transport.jedz();
        praca.pracuj();
    }


}
