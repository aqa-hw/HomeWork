package hw9_2;
import java.util.ArrayList;
public class Array {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();


        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }

        System.out.println("ArrayList: " + arrayList);

        arrayList.remove(2);
        arrayList.remove(4);
        arrayList.remove(7);

        System.out.println("ArrayList after removal: " + arrayList);

        arrayList.set(5, 100);

        System.out.println("ArrayList after change: " + arrayList);
    }
}

