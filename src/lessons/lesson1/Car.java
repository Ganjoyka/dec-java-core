package lessons.lesson1;

public class Car {
    private String model;
    private int power;
    private double volumeEngine;
    private boolean turbo;

    public Car(String model, int power, double volumeEngine, boolean turbo) {
        this.model = model;
        this.power = power;
        this.volumeEngine = volumeEngine;
        this.turbo = turbo;
    }

    public void printDetails() {
        System.out.println("Car Details:");
        System.out.println("Model: " + model);
        System.out.println("Power: " + power);
        System.out.println("Volume Engine: " + volumeEngine);
        System.out.println("Turbo: " + turbo);
    }

    public static void main(String[] args) {
        Car car = new Car("BMW", 300, 2.0, true);
        car.printDetails();
    }
}
