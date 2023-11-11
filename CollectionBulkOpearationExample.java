import java.util.*;

public class CollectionBulkOpearationExample {
    public static void main(String args[])
        {
            List <Integer> list = new ArrayList<Integer>();
            list.add(10);
            list.add(24);
            list.add(34);

            List <Integer> list1 = new ArrayList<Integer>();
            list1.add(10);
            list1.add(24);
            list1.add(34);

            System.out.println("ContainsAll : " + list.containsAll(list1));
            System.out.println("Add All : " + list.addAll(list1));
            System.out.println("Remove All : " + list.removeAll(list1));
            System.out.println("Retain All : " + list.retainAll(list1));
    
        }
}
