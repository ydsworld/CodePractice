package stringManupulation;

/**
 * Created by AK on 11/2/16.
 */
public class SubStringTest {
    public static void main(String[] args) {

        String str = "1. text Scroll-arrow-down.png, Alt text1 Scroll Down";
        System.out.println(str.indexOf(":"));
        System.out.println(str.substring(str.indexOf(":")+1));

    }

}
