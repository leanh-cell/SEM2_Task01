package DemoArrayList;
import java.util.List;
import java.util.ArrayList;
public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> FirstFivePrimeNumber = new ArrayList<>();
        FirstFivePrimeNumber.add(1);
        FirstFivePrimeNumber.add(2);
        FirstFivePrimeNumber.add(3);
        FirstFivePrimeNumber.add(4);
        FirstFivePrimeNumber.add(5);

        List<Integer> FirstTenPrimeNumber = new ArrayList<>(FirstFivePrimeNumber);

        List<Integer> nextFivePrimeNumber = new ArrayList<>();
        nextFivePrimeNumber.add(11);
        nextFivePrimeNumber.add(12);
        nextFivePrimeNumber.add(13);
        nextFivePrimeNumber.add(14);

       FirstTenPrimeNumber.addAll(nextFivePrimeNumber);
        System.out.println(FirstTenPrimeNumber);
    }
}
