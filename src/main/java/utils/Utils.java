package utils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Arun on 5/28/16.
 */
public class Utils {

    public static String finditem(ArrayList<String> alist){
        StringBuilder sb = new StringBuilder();
        String re1=".*?";	// Non-greedy match on filler
        String re2="(^#|^&)";	// Word 1
        Pattern p = Pattern.compile(re1+re2,Pattern.CASE_INSENSITIVE | Pattern.DOTALL);

        for(String str:alist){

            Matcher m = p.matcher(str);
            if (m.find())
            {
                //  System.out.println("found" + m.group(1));
                sb.append(str);
                sb.append(",");

            } else {
                // System.out.print("not found");
            }
        }

        return sb.toString();
    }
}
