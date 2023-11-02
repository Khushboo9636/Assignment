package Java_Assignment;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        // Task A: Shuffle an array
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);
        System.out.println("Shuffled Array: " + Arrays.toString(list.toArray()));
    }


}
