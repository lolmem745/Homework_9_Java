package Homework;

import java.util.Random;

public class Laptop {
    private static int id;

    private final String LaptopId;
    private final int price;
    private final int RAM;
    private final int ID;
    private final int[] memory = {128, 256, 512 ,1024, 2048, 4096, 8192, 16384};
    Random random = new Random();
    static {
        id = 1;
    }

    public Laptop(){
        this.ID = id;
        this.LaptopId = "Laptop_" + id++;
        this.price = random.nextInt(1,5001);
        this.RAM = memory[random.nextInt(1,8)];
    }

    public int getPrice(){
        return this.price;
    }

    public int getRAM(){
        return this.RAM;
    }

    public int getID(){
        return this.ID;
    }

    public void getLaptopStats() {
        System.out.println(this.LaptopId + ": RAM=" + this.RAM + ", Price=" + this.price + ".");
    }
}
