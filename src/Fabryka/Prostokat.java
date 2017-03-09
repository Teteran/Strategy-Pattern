package Fabryka;

/**
 * Created by Kacper on 2017-03-09.
 */
public class Prostokat implements IFigura {

    @Override
    public String getNazwa() {
        return this.getClass().getName();
    }
}


