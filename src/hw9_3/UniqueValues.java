package hw9_3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueValues {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("Perl");
        arrayList.add("C++");
        arrayList.add("Java");
        arrayList.add("C++");
        arrayList.add("C#");

        Set<String> uniqueValues = new HashSet<>();

        for (String value : arrayList) {
            uniqueValues.add(value);
        }

        List<String> uniqueList = new ArrayList<>(uniqueValues);

        System.out.println("Unique values: " + uniqueList);
    }
}
