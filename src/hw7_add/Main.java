package hw7_add;

import static hw7_add.Service.*;

public class Main {
    public static void main(String[] args) {
        Bill johnAccount = new Bill(10000);
        Person john = new Person("John", johnAccount);
        plus(john, 1000);
        minus(john,2000);
        divide(john,2);
    }
}