package hw7_1;

class Fish extends Animal {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " blup-blup");
    }
}
