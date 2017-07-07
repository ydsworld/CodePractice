package json;


import org.apache.commons.lang3.StringUtils;
import org.apache.sling.commons.json.JSONArray;
import org.apache.sling.commons.json.JSONObject;



import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by AK on 3/19/17.
 */
public class ArrayToJsonString {
    public static void main(String[] args) {

        String[] paage = {"page1","page2"};
        String[] path = {"path1","path2"};

        String str = StringUtils.join(paage,",");

        System.out.println(str);

        String jsonString = null;
     //   StringBuilder

        try {
            int index =0;
            JSONArray jArry=new JSONArray();

            for (String page: paage) {

                Map item_root = new LinkedHashMap();
                item_root.put("page", page);
                item_root.put("path", path[index]);

                JSONObject jObjd = new JSONObject(item_root);
                jArry.put(jObjd);
                index++;
            }

            System.out.println(jArry.toString());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }




      //  OUTPUT:


      //  {"JSON2":"Hello my World!","JSON3":{"key1":"value1"},"JSON1":"Hello World!"}
//        var mValues = [ {"page":"page 1","path":"path 1"},{"page":"page2","path":"page3"} ],


   //     String[] pages = mValue.get("page", String[].class);
    //    String[] patb = mValue.get("path", String[].class);




    }
}