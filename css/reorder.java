
import java.util.*;

public class ReorderList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original List: " + list);

        LinkedList<Integer> result = new LinkedList<>();

        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            result.add(list.get(left));
            left++;

            if (left <= right) {
                result.add(list.get(right));
                right--;
            }
        }

        System.out.println("Reordered List: " + result);
    }
}
