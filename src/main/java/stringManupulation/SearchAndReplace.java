package stringManupulation;


import org.apache.commons.lang3.StringUtils;

/**
 * Created by Arun on 5/19/16.
 */
public class SearchAndReplace {
    public static void main(String[] args) {
         String[] str = new String[4];

        str[0] = "Dominique's Victoza<sup>®</sup> story";
        str[1] = "Dominique's \"Diabetes Dream Team\"";
        str[2] = "Dominique's Strategy";

        for (int i = 0; i < str.length; i++) {
            if(StringUtils.isNotEmpty(str[i])) {
                str[i] = str[i].replaceAll("[^a-zA-Z0-9]", "-");
                System.out.println(str[i]);
            }
        }
    }
}
