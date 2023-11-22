package hw11_2;

import java.io.*;

public class Cat implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private transient Integer weight;

    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = (int) weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    static void serializeCat(Cat cat, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(cat);
            System.out.println("Cat serialized and saved to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Cat deserializeCat(String fileName) {
        Cat cat = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            cat = (Cat) ois.readObject();
            System.out.println("Cat deserialized from " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return cat;
    }
}
