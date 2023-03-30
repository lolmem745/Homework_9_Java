package Homework;

import java.util.ArrayList;

public class CreateAndSort {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static ArrayList<Laptop> CreateAndSort(int ArrayCapacity, String SortType){
        ArrayList<Laptop> laptops = new ArrayList<>(16);
        fillArray(laptops, ArrayCapacity);
        printStats(laptops,"NameUp");
        switch (SortType) {
            case "NameUp" -> laptops.sort(new ComparatorNameUp());
            case "PriceDown" -> laptops.sort(new ComparatorPriceDown());
            case "PriceUp" -> laptops.sort(new ComparatorPriceUp());
            case "RamDown" -> laptops.sort(new ComparatorRamDown());
            case "RamUp" -> laptops.sort(new ComparatorRamUp());
            case "NameDown" -> laptops.sort(new ComparatorNameDown());
        }
        System.out.println();
        printStats(laptops,SortType);
        System.out.println(ANSI_RED + "----------------------------------" + ANSI_RESET);
        return laptops;
    }
    public static void Sort(ArrayList<Laptop> laptops, String SortType){
//        printStats(laptops,Helper.SortType);
        switch (SortType) {
            case "NameUp" -> laptops.sort(new ComparatorNameUp());
            case "PriceDown" -> laptops.sort(new ComparatorPriceDown());
            case "PriceUp" -> laptops.sort(new ComparatorPriceUp());
            case "RamDown" -> laptops.sort(new ComparatorRamDown());
            case "RamUp" -> laptops.sort(new ComparatorRamUp());
            case "NameDown" -> laptops.sort(new ComparatorNameDown());
        }
        printStats(laptops,SortType);
        System.out.println(ANSI_RED + "----------------------------------" + ANSI_RESET);
    }

    public static void fillArray(ArrayList<Laptop> laptops, int maxLaptops) {
        for (int i = 0; i < maxLaptops; i++) {
            laptops.add(new Laptop());
        }
    }
    public static void printStats(ArrayList<Laptop> laptops, String SortType) {

        switch (SortType) {
            case "NameUp" -> System.out.println(ANSI_BLUE + "Name Up" + ANSI_RESET);
            case "PriceDown" -> System.out.println(ANSI_BLUE + "Price Down" + ANSI_RESET);
            case "PriceUp" -> System.out.println(ANSI_BLUE + "Price Up" + ANSI_RESET);
            case "RamDown" -> System.out.println(ANSI_BLUE + "Ram Down" + ANSI_RESET);
            case "RamUp" -> System.out.println(ANSI_BLUE + "Ram Up" + ANSI_RESET);
            case "NameDown" -> System.out.println(ANSI_BLUE + "Name Down" + ANSI_RESET);
        }
        for (Laptop laptop : laptops) {
            laptop.getLaptopStats();
        }
    }
}
