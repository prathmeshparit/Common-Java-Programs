import java.util.*;
class ToArrayMethodExample1
{
    public static void  main(String args[])
    {
        List <Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(24);
        list.add(34);


        Object[] arr = list.toArray();

        for(Object x : arr)
        {
            System.out.println(x + " ");
        }
    }
}


public class  ToArrayMethodExample
{
    public static void main(String args[])
    {
        List <Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(24);
        list.add(34);


        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr);

        for(Integer x : arr)
        {
            System.out.println(x + " ");
        }
    }
}