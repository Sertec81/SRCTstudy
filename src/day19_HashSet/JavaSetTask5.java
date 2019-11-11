package day19_HashSet;
import java.util.HashSet;
public class JavaSetTask5 {
    public static void main(String[] args) {
        //5. Write a Java program to test a hash set is empty or not.
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        System.out.println(numbers);

        if (numbers.isEmpty()) {
            System.out.println("It is empty");
        } else {
            System.out.println(numbers);
        }
    }

}
