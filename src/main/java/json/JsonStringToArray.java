package json;


//import org.apache.commons.lang3.StringUtils;

import org.apache.sling.commons.json.JSONArray;
import org.apache.sling.commons.json.JSONObject;

import java.util.*;

//import org.apache.sling.commons.json.JSONException;
//import org.apache.sling.commons.json.util.CDL;

/**
 * Created by AK on 3/19/17.
 */
public class JsonStringToArray {
    public static void main(String[] args) {


        //String[] items = {"{\"radioOptions\":\"sat4\",\"radioOptionValues\":\"sat value4\"}", "{\"radioOptions\":\"sat4\",\"radioOptionValues\":\"sat value5\"}"};


        String[] radioOption = {"option1", "option2", "option3", "option4"};
        String[] radioOptionValue = {"value1", "value2", "value3", "value4"};

        List<String[]> fieldValues = new ArrayList<>();
        fieldValues.add(radioOption);
        fieldValues.add(radioOptionValue);


        List<String> fields = new ArrayList<>();
        fields.add("radioOptions");
        fields.add("radioOptionValues");


        String json = "";
        Map item_root = new LinkedHashMap();
        Iterator<String[]> itr = fieldValues.iterator();
        JSONArray jArry = new JSONArray();


        JSONObject jObjd = null;

        for (int i=0; i <fieldValues.get(0).length; i++) {
            for (int j = 0; j < fields.size(); j++) {
                item_root.put(fields.get(j),fieldValues.get(j)[i]);
            }
            jObjd = new JSONObject(item_root);
            jArry.put(jObjd);
        }
        System.out.println(jArry.toString());

        System.out.println("done");

        }
    }
