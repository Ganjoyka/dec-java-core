package lessons.lesson1;

public class Dog {
    private String name;
    private int age;
    private String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void printDetails() {
        System.out.println("Dog Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Max", 3, "Labrador");
        dog.printDetails();
    }
}
