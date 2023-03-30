package Homework;

import java.util.Comparator;

public class ComparatorNameUp implements Comparator<Laptop> {

    @Override
    public int compare(Laptop o1, Laptop o2) {
        return o1.getID() - o2.getID();
    }
}
