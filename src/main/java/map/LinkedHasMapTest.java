package map;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Created by AK on 10/28/16.
 */
public class LinkedHasMapTest {

    public static void main(String a[]){

        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
        lhm.put("one", "This is first element");
        lhm.put("two", "This is second element");
        lhm.put("four", "Element inserted at 3rd position");
        Set<String> keys = lhm.keySet();
        int index=1;
        for(String k:keys){
            System.out.println(index + " " + k+" -- "+lhm.get(k));
            index++;
        }
    }
}
