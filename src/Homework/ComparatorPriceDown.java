package Homework;

import java.util.Comparator;

public class ComparatorPriceDown implements Comparator<Laptop> {
    @Override
    public int compare(Laptop o1, Laptop o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
