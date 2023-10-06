//Task#1
/*
import java.util.Scanner;
public class hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array length ");
        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Add " + length + " digits:");

        for (int i = 0; i < length; i++) {
            System.out.print("Digit " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Array:");

        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);

        }

    }
}
*/
//Task#2
/*
public class hw3 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++){
            for (int j = 9; j > 0; j--){
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}
*/
//Task#3
/*public class hw3 {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }
}
public class hw3 {
    public static void main(String[] args) {
        int i = 10;
        do{
            System.out.println(i);
            i--;
        }while(i >= 0);
    }
}
*/
//Task#4
/*public class hw3 {
    public static void main(String[] args) {
        int[][] arr = new int[3][6];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = i + j;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
*/
//Add_task#1
/*public class hw3 {

    public static void main(String[] args) {
        int[] a = new int[]{3, 6, 8, 12, 7, 0, 44, -33};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++){
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
*/
//Add_task#2
/*public class hw3 {
    public static void quickSort(int[] sortArr, int low, int high) {
        if (sortArr.length == 0 || low >= high) return;

        int middle = low + (high - low) / 2;
        int border = sortArr[middle];

        int i = low, j = high;
        while (i <= j) {
            while (sortArr[i] < border) i++;
            while (sortArr[j] > border) j--;
            if (i <= j) {
                int swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }

        if (low < j) quickSort(sortArr, low, j);
        if (high > i) quickSort(sortArr, i, high);
    }

    public static void main(String args[]) {
        int[] sortArr = {1, 16, 34, 100, -15, 210};
        quickSort(sortArr, 0, sortArr.length - 1);
        for (int i = 0; i < sortArr.length; i++) {
            System.out.print(sortArr[i] + "\n");
        }
    }
}
*/
//Я выбрал Быструю сортировку (Алгоритм Хоара), поскольку у него приемлимая сложность, он может сортировать большие обьемы данных и не занимает много памяти. А еще знающие люди в интернете говорят, что он хорош :)