package DemoArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListCollectionsSortExample {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(13);
        number.add(7);
        number.add(18);
        number.add(5);
        System.out.println("Before : "+number);
        Collections.sort(number);
        System.out.println("After : "+number);
    }
}
