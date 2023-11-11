import java.util.*;

public class Set2 {

    public static void main(String args[]) {
        Integer[] A = { 22, 45, 33, 66, 55, 34, 77 };
        Integer[] B = { 33, 2, 83, 45, 3, 12, 55 };

        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        set1.addAll(Arrays.asList(A));
        set2.addAll(Arrays.asList(B));

        // Finding the union of set1 and 2;

        Set<Integer> union_data = new HashSet<Integer>(set1);
        union_data.addAll(set2);

        System.out.print("Union of set1 and set2 : " + union_data);

        // Finding the intersection of set 1 and 2;

        Set<Integer> int_data = new HashSet<Integer>(set1);
        int_data.retainAll(set2);
        System.out.print("ntersection of set1 and set2 : " + int_data);

        // Finding the Diffrence of set 1 and 2;

        Set<Integer> diff = new HashSet<Integer>(set1);
        diff.removeAll(set2);
        System.out.print("Difference of set1 and set2 : " + diff);
    }

}
