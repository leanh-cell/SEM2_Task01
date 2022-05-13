package DemoArrayList;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("Lion");
        animals.add("tiger");
        System.out.println(animals);
        animals.add(3,"elephant");
        System.out.println(animals);
    }

}
