package temp;

import model.User;

/**
 * Created by Arun on 4/17/16.
 */
public class TestClass {
    public static void main(String[] args){
        User user = new User();
        user.setUsername("JohnSmith");

        System.out.println("User name: " + user.getUsername());
    }
}
