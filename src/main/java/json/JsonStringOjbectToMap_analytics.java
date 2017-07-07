package json;


import org.apache.sling.commons.json.JSONArray;
import org.apache.sling.commons.json.JSONObject;

/**
 * Created by AK on 5/20/17.
 */
public class JsonStringOjbectToMap_analytics {
    public static void main(String[] args) {


        String jsonStr = "[{\n" +
                "    \"categories\": [\n" +
                "        { \"text\": \"Do not track\",                \"value\": \"\" },\n" +
                "        { \"text\": \"Brochure\",                    \"value\": \"Brochures\" },\n" +
                "        { \"text\": \"Presentation\",                \"value\": \"Presentations\" },\n" +
                "        { \"text\": \"Patient Education Material\",  \"value\": \"Patient Education Materials\" },\n" +
                "        { \"text\": \"Patient Support Material\",    \"value\": \"Patient Support Materials\" },\n" +
                "        { \"text\": \"Video\",                       \"value\": \"Videos\" },\n" +
                "        { \"text\": \"Document\",                    \"value\": \"Documents\" },\n" +
                "        { \"text\": \"External Site\",               \"value\": \"External Sites\" },\n" +
                "        { \"text\": \"Internal Link\",               \"value\": \"Internal Links\" },\n" +
                "        { \"text\": \"Starter/Benefits Kit\",        \"value\": \"Starter/Benefits Kits\" },\n" +
                "        { \"text\": \"Co-pay Card(s)\",              \"value\": \"Co-pay Cards\" },\n" +
                "        { \"text\": \"Study Reprint\",               \"value\": \"Study Reprints\" },\n" +
                "        { \"text\": \"Study Abstract\",              \"value\": \"Study Abstracts\" },\n" +
                "        { \"text\": \"Curated Set\",                 \"value\": \"Curated Sets\" },\n" +
                "        { \"text\": \"Application/Request Form\",    \"value\": \"Application/Request Forms\" },\n" +
                "        { \"text\": \"Prescribing Information\",     \"value\": \"Prescribing Informations\" },\n" +
                "        { \"text\": \"Safety Data Sheet\",           \"value\": \"Safety Data Sheet\" }\n" +
                "    ],\n" +
                "    \"actions\": [\n" +
                "        { \"text\": \"Do not track\",  \"value\": \"\" },\n" +
                "        { \"text\": \"Download\",      \"value\": \"Downloaded\" },\n" +
                "        { \"text\": \"View\",          \"value\": \"Viewed\" },\n" +
                "        { \"text\": \"Visit\",         \"value\": \"Visited\" },\n" +
                "        { \"text\": \"Follow\",        \"value\": \"Followed\" }\n" +
                "    ]\n" +
                "}]";



            try {
                JSONArray array = new JSONArray(jsonStr);

                for(int i=0; i<array.length(); i++){
                    JSONObject jsonObj  = array.getJSONObject(i);
                    JSONArray array1 = new JSONArray(jsonObj.get("categories").toString());
                    for(int j=0; j<array1.length(); j++) {
                        JSONObject jsonObj1  = array1.getJSONObject(j);
                        System.out.println("value: " + jsonObj1.getString("value"));
                        System.out.println("text: " + jsonObj1.getString("text"));
                    }
                }

            } catch (Exception e){
                System.out.println(e.getMessage());
            }

      //  System.out.println(jArry.toString());

        System.out.println("done");

    }
} // main
