package Dekorator;

/**
 * Created by Kacper on 2017-04-01.
 */
public class DekoratorStarter {


    public DekoratorStarter(){
        Produkt p1 = new Koszulka();
        System.out.println(p1.about()+ " == "+ p1.cena());
        System.out.println("|||||||||||||||||||||||||||");
        p1 = new Smycz(p1);
        System.out.println(p1.about()+ " == "+ p1.cena());
        System.out.println("|||||||||||||||||||||||||||");
        p1 = new Pendrive(p1);

        System.out.println(p1.about()+ " == "+ p1.cena());
    }
}
