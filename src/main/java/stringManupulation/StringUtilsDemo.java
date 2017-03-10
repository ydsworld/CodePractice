package stringManupulation;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by AK on 2/27/17.
 */
public class StringUtilsDemo {
    public static void main(String[] args) {
        System.out.println(StringUtils.isBlank(null));
        System.out.println(StringUtils.isBlank(""));
        System.out.println(StringUtils.isBlank(" "));
        System.out.println(StringUtils.isBlank("bob"));
        System.out.println(StringUtils.isBlank("  bob  "));

        System.out.println(StringUtils.isEmpty(null));
        System.out.println(StringUtils.isEmpty(""));
        System.out.println(StringUtils.isEmpty(" "));
        System.out.println(StringUtils.isEmpty("bob"));
        System.out.println(StringUtils.isEmpty("  bob  "));
    }
}
