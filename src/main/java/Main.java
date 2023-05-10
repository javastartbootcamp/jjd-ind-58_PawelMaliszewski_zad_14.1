import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Map<Integer, Integer> numbers = new TreeMap<>();
        //String fileName = "src\\main\\java\\liczby.txt"; // z tym plikiem test 1 i 3 nie przechodzi
        String fileName = "liczby.txt";
        try (Scanner sc = new Scanner(new File(fileName))
        ) {
            while (sc.hasNextInt()) {
                int number = sc.nextInt();
                if (numbers.containsKey(number)) {
                    int repetitionOfNumber = numbers.get(number) + 1;
                    numbers.put(number, repetitionOfNumber);
                } else {
                    numbers.put(number, 1);
                }
            }
        }
        Collection<Integer> values = numbers.values();
        Set<Integer> integers = numbers.keySet();
        for (Integer integer : integers) {
            System.out.println(integer + " - liczba wystąpień " + numbers.get(integer));
        }
    }
}