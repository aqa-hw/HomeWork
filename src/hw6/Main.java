package hw6;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2022);
        Car car2 = new Car("Toyota", 2023);

        System.out.println("Сравнение car1 и car2: " + car1.equals(car2));
        //System.out.println("Сравнение car1 и car2 по полю 'brand': " + car1.equals(car2));

        System.out.println(car2);
    }
}
