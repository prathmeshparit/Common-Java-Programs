import java.util.*;


public class ListIteratorExample {

    /**
     * @param args
     */
    public static void main(String args[])
    {
        List<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(34);
        list.add(45);

        ListIterator <Integer> li = list.listIterator(list.size());
        li.add(29);
        while(li.hasPrevious())
        {
            System.out.println(li.previous());
            
        }


    }    
}
