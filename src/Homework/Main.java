package Homework;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Laptop> laptops1 = CreateAndSort.CreateAndSort(16, "PriceUp");
        CreateAndSort.Sort(laptops1,"PriceDown");
        CreateAndSort.Sort(laptops1, "RamDown");
        CreateAndSort.Sort(laptops1, "NameUp");
        CreateAndSort.Sort(laptops1, "RamUp");
        CreateAndSort.Sort(laptops1, "NameDown");

    }




}