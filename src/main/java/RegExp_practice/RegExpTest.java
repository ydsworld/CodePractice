package RegExp_practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Arun on 5/27/16.
 */
public class RegExpTest {
     public static void main(String[] args){

//         String test = "https://www.google.com";
//         System.out.println(test.matches("^(http|https|ftp)://.*$"));


//         String test = "/etc/somethig";
//         System.out.println(test.matches(re1+re2));

         String txt="/etc/design/somethig/etc/e";

         String rex1=".*?";	// Non-greedy match on filler
         String rex2 ="(^\\/content\\/|^\\/etc\\/design\\/)";

         Pattern pattern = Pattern.compile(rex1+rex2,Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
         Matcher m = pattern.matcher(txt);
         if (m.find())
         {
             System.out.println("found : " + m.group(1));
         } else {
             System.out.print("not found");
         }
 } //main

     }

