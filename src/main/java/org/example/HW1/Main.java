package org.example.HW1;

public class Main {
    public static void main(String[] args) {
        WorkerProfile ivan = new WorkerProfile("Ivan", 25, 100000);
        WorkerProfile semen = new WorkerProfile("Semen", 25, 100000);
        DriverProfile ivan2 = new DriverProfile("Ivan", 25,1000, "C");
        System.out.println(ivan2.profileInfo());
        System.out.println(ivan.profileInfo());
    }
}