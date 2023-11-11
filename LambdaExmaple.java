import java.util.*;
import java.util.function.Predicate;

public class LambdaExmaple {
    public static void printCond(Collection<Integer>c,Predicate<Integer> t)
        {

            for(Integer x : c)
            {
               if(t.test(x))
               {
                System.out.print(x + " ");

               }

            }
        }
    
    public static void main(String args[])
    {
        List <Integer>  list = new ArrayList<Integer>();
        list.add(12);
        list.add(17);
        list.add(16);

        printCond(list, x -> x%2==0);

    }
    
}
