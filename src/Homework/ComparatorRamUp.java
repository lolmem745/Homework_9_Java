package Homework;

import java.util.Comparator;

public class ComparatorRamUp implements Comparator<Laptop> {
    @Override
    public int compare(Laptop o1, Laptop o2) {
        if (o2.getRAM() == o1.getRAM()) {
            return o1.getPrice() - o2.getPrice();
        }
        return o1.getRAM() - o2.getRAM();
    }
}
