package Homework;

import java.util.Comparator;

public class ComparatorRamDown implements Comparator<Laptop> {
    @Override
    public int compare(Laptop o1, Laptop o2) {
        if (o2.getRAM() == o1.getRAM()) {
            return o2.getPrice() - o1.getPrice();
        }
        return o2.getRAM() - o1.getRAM();
    }
}
