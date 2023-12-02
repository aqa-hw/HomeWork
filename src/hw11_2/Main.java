package hw11_2;

import static hw11_2.Cat.deserializeCat;
import static hw11_2.Cat.serializeCat;

public class Main {
    public static void main(String[] args) {

        Cat myCat = new Cat("Barsik", 3, 5.5);

        serializeCat(myCat, "cat.ser");

        Cat readCat = deserializeCat("cat.ser");
        System.out.println("Read Cat: " + readCat);
    }
}
