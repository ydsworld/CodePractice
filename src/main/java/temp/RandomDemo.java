package temp;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by AK on 8/31/16.
 */
public class RandomDemo {
    public static void main(String[] args) {
        //int i = (int) (Math.random() * 101);
        //String div = "div" + i;
        //  System.out.println(div);
        int[] array = new int[100];
        String str1 = "Something1";

        for (int k = 0; k < 100; k++) {
            int i = 1 + (int) (Math.random() * ((400 - 1) + 1)) ;
           // int j = 401 + (int) (Math.random() * ((500 - 401) + 1)) ;

            array[k] = (i + str1.hashCode());
            System.out.println(array[k]);
        }

        Set<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < array.length ; i++)
        {
            //If same integer is already present then add method will return FALSE
            if(set.add(array[i]) == false)
            {
                System.out.println("Duplicate element found : " + array[i]);
            }
        }

    }

}