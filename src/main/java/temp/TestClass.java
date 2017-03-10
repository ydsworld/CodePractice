package temp;

import com.sun.deploy.util.StringUtils;
import model.User;
import org.jsoup.helper.StringUtil;
import org.apache.commons.lang3.*;
/**
 * Created by Arun on 4/17/16.
 */
public class TestClass {
    public static void main(String[] args){

//        User user = new User();
//        user.setUsername("JohnSmith");
//
//
//        System.out.println("User name: " + user.getUsername());

        String e1 = "d";
        String e2 = "d";

        String t1 = "d";
        String t2 = "d";

        if ((e1 == null || e2 == null) && (t1 == null || t2 == null)) {
            System.out.println("soeht");
        }

        if(org.apache.commons.lang3.StringUtils.isNotEmpty(t1) && org.apache.commons.lang3.StringUtils.isNotEmpty(t2)){
            System.out.println("not empty");
        }

    }
}
