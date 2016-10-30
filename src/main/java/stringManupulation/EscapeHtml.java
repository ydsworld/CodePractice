package stringManupulation;


import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

public class EscapeHtml {
    public static void main(String[] args){
        String str = "'Bread' <sub>®</sup>'Butter' YDSWorld™";
        String escapedStr = StringEscapeUtils.escapeHtml4(str);
        System.out.println(escapedStr);


        String text = "I will sign up for dosing and refill reminders on <a href=\'/content/saxendacare/en/my-settings.html\'>My Settings page</a>.";
        String str1 =  StringUtils.replace(text, "\"", "&quot;");
        System.out.println(str1);

    }
}
