package hw7_1;
public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("bird", 2);
        Fish fish = new Fish("salmon", 3);
        Mammal mammal = new Mammal("lion", 5);

        bird.makeSound();
        bird.fly();

        fish.makeSound();

        mammal.makeSound();
    }
}