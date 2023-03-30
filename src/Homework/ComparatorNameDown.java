package Homework;

import java.util.Comparator;

public class ComparatorNameDown implements Comparator<Laptop> {

    @Override
    public int compare(Laptop o1, Laptop o2) {
        return o2.getID() - o1.getID();
    }
}
