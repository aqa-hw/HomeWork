package hw7_3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 25000.0, "Синий");

        System.out.println("Mark: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
    }
}

