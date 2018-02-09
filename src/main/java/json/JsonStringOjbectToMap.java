package json;


        import org.apache.sling.commons.json.JSONArray;
        import org.apache.sling.commons.json.JSONObject;

import java.util.*;

/**
 * Created by AK on 5/20/17.
 */
public class JsonStringOjbectToMap {
    public static void main(String[] args) {


        String jsonStr = "[\n" +
                "{ \"value\": \"http://publish.ydsworld.com:4503\", \"text\": \"Production Publish (http://publish1.ydsworld.com:4503)\"},\n" +
                "{ \"value\": \"http://publish.prb.ydsworld.com:4503\", \"text\": \"PRB Publish (http://publish.prb.ydsworld.com:4503)\"},\n" +
                "{ \"value\": \"http://publish.qa.ydsworld.com:4503\", \"text\": \"QA Publish (http://publish1.qa.ydsworld.com:4503)\"}\n" +
                "]";



            try {
                JSONArray array = new JSONArray(jsonStr);
                //System.out.println(array.toString());
                for(int i=0; i<array.length(); i++){
                    JSONObject jsonObj  = array.getJSONObject(i);
                    System.out.println("value: "+ jsonObj.getString("value"));
                    System.out.println("text: " +jsonObj.getString("text"));
                }

            } catch (Exception e){
                System.out.println(e.getMessage());
            }

      //  System.out.println(jArry.toString());

        System.out.println("done");

    }
} // main
