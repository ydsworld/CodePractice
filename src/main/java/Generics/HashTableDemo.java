package Generics;

import java.util.Hashtable;

/**
 * Created by AK on 3/15/17.
 */
public class HashTableDemo {
    public static void main(String[] args){
        Hashtable<String, String> hashtable = new Hashtable();
        hashtable.put("image1","added");
        hashtable.put("image2","added");
        hashtable.put("image3","added");
        hashtable.put("image2","added1");

        System.out.println(hashtable);

    }
}
