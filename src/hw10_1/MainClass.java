package hw10_1;

import java.util.ListIterator;

public class MainClass<T> {

    public static void main(String[] args) {
        CustomLinkedList<Integer> arr = new CustomLinkedList<>();


        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

//        arr.set(3, 10);
//        arr.remove(2);
//
//
//       System.out.println(arr.getLast());

        ListIterator<Integer> iterator = arr.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Reverse:");

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}

