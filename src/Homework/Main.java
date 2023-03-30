package Homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>(10);
    fillArray(laptops, 10);
    printStats(laptops);
    laptops.sort(new ComparatorRamDown());
    printStats(laptops);
    }

    public static void printStats(ArrayList<Laptop> laptops) {
        for (Laptop laptop : laptops) {
            laptop.getLaptopStats();
        }
        System.out.println();
    }

    public static void fillArray(ArrayList<Laptop> laptops, int maxLaptops) {
        for (int i = 0; i < maxLaptops; i++) {
            laptops.add(new Laptop());
        }
    }
}