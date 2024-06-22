import java.util.ArrayList;
import java.util.List;

/**
 * ArrayListExample
 * - Array list a dynamic array
 * - Initialised with some default capacity, when capacity is reached it creates new array of bigger size
 * which is 50% greater than previous size
 * - To be used when we don't know the size of array.
 */
public class ArrayListExample {

    public static void main(String[] args) {
        List<Integer> aList1 = new ArrayList<>();
        aList1.add(1);
        aList1.add(2);
        aList1.add(3);
        aList1.add(4);
        System.out.println("List1: " + aList1);

        // Makes a copy of aList1
        List<Integer> aList2 = new ArrayList<>(aList1);
        aList2.add(5);
        System.out.println("List2: " + aList2);

        // Sublist gives a chunk of array, doesn't create a copy
        // Hence when updated in aList3, will be shown in aList2
        List<Integer> aList3 = aList2.subList(1, 4);
        System.out.println("List3: " + aList3);
        
        aList3.set(0, 100);

        System.out.println("List2: " + aList2);
    }
}