
import java.util.*;


public class IteratorExample {

    public static void main(String args[])
    {
        List <Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(24);
        list.add(34);


        Iterator <Integer> e = list.iterator();
        while(e.hasNext())
        {
            int x = (Integer)e.next();
            System.out.println(x);
        }
    }
    
}
