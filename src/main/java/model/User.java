package model;

import lombok.Data;

/**
 * Created by AK on 7/25/16.
 */

@Data   // Lombok Annotation , this will create setter and getter automaticaly
public class User {

    private String username;
    private String password;
}
