package serialVersionUID;

import java.io.Serializable;

/**
 * Created by Arun on 2/26/16.
 */
public class Member implements Serializable{

    private static final long serialVersionUID = 1L;

    String firstName;
    String lastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

