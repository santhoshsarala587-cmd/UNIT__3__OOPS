import java.util.Scanner;


interface Insurable {
    void calculateInsurance();
}

class Vehicle {
    protected String brand;
    protected int year;

    static int vehicleCount = 0;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        vehicleCount++;
    }

    public void showVehicleInfo() {
        System.out.println("----------------------------------------");
        System.out.println("Vehicle Details");
        System.out.println("----------------------------------------");
        System.out.println("Brand               : " + brand);
        System.out.println("Manufacturing Year  : " + year);
    }
}

class Car extends Vehicle implements Insurable {

    private double price;
    private final double insuranceRate = 0.05;

    public Car(String brand, int year, double price) {
        super(brand, year);
        this.price = price;
    }

    @Override
    public void calculateInsurance() {
        double insurance = price * insuranceRate;
        System.out.println("Price               : " + price);
        System.out.println("Insurance (5%)      : " + insurance);
        System.out.println("----------------------------------------");
    }
}

class Bike extends Vehicle implements Insurable {

    private double price;
    private final double insuranceRate = 0.03;

    public Bike(String brand, int year, double price) {
        super(brand, year);
        this.price = price;
    }

    @Override
    public void calculateInsurance() {
        double insurance = price * insuranceRate;
        System.out.println("Price               : " + price);
        System.out.println("Insurance (3%)      : " + insurance);
        System.out.println("----------------------------------------");
    }
}