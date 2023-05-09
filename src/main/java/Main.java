import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    static Map<Integer, Number> numbers = new TreeMap<>();

    public static void main(String[] args) throws FileNotFoundException {

        try (Scanner sc = new Scanner(new File("liczby.txt"))
        ) {
            while (sc.hasNextLine()) {
                int number = sc.nextInt();
                if (numbers.containsKey(number)) {
                    int repetitionOfNumber = numbers.get(number).getQuantityOfNumber() + 1;
                    numbers.put(number, new Number(number, repetitionOfNumber));
                } else {
                    numbers.put(number, new Number(number, 1));
                }
            }
        }

        Collection<Number> numbers = Main.numbers.values();
        for (Number number : numbers) {
            System.out.println(number);
        }
    }
}