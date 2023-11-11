package hw9_add;

import java.util.ArrayList;
import java.util.List;

public class CountDuplicates {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);

        int count = counterCatch(arrayList, 2);

        System.out.println("Duplicates of 2: " + count);
    }

    public static int counterCatch(List<Integer> list, int numberToCount) {
        int count = 0;
        for (int number : list) {
            if (number == numberToCount) {
                count++;
            }
        }
        return count;
    }
}
