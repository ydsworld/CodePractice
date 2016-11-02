package map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AK on 10/31/16.
 */
public class HashMapAsParameter {
    public static void main(String[] args){
        Map<String , String> hashMap = new HashMap<String, String>();
        fillHashMap(hashMap);

        for (String key:hashMap.keySet()){
            System.out.println(key + " " + hashMap.get(key));
        }
    }

    static void fillHashMap(Map<String,String> hm){
        hm.put("Alvin", "A+");
        hm.put("Alvin1", "b+");
        hm.put("Alvin3","c+");
    }
}
