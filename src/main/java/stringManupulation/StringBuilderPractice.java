package stringManupulation;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Arun on 5/27/16.
 */
public class StringBuilderPractice {
    public static void main(String[] args) {
            StringBuilder sb = new StringBuilder();
//        sb.append("/conte/soof1,")  ;
//        sb.append("/ect/sof1");
        String str = sb.toString();
       if (StringUtils.isEmpty(str)){
           System.out.println("enoty");
       }
    }
}
