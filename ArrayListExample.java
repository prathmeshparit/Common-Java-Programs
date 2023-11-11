import java.util.*;

public class ArrayListExample {
    public static void main(String args[])
    {
        int arr[] = {20,12,25,50,30,40};
        int k=30;

        List<Integer> al = getSmaller(arr,k);

        for(int x : al)
        {
            System.out.print(x + " ");
        }
    }



    public static List<Integer> getSmaller(int arr[],int k)
    {
        List <Integer> al = new ArrayList<Integer>();


        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < k)
                al.add(arr[i]);
        }

        return al;

    }
    
}
