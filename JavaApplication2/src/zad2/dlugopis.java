package zad2;

import zad1.Product;

/**
 *
 * @author Kamil
 */
public class dlugopis extends Product{

    public dlugopis(double price, String nazwa, String opis) {
        super(price, nazwa, opis);
    }
    @Override
    public void buy() {
        System.out.println("Kupiłem długopis!");
    }

    @Override
    public void pokazInfo() {
        System.out.println("Cena:" + getPrice() + " nazwa:" + getName() + " opis:" + getDescribe());
    }
}