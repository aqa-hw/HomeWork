package hw9_1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        try {
            car.setMake("Toyota");
            car.setModel("Camry");
            car.setYear(2004);
            car.setPrice(-5000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exceptions: " + e.getMessage());
        }

        System.out.println("Maker: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
    }
}
