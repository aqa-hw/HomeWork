package hw7_1;

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }
    interface Flyable {
        void fly();
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " tweet");
    }

}
