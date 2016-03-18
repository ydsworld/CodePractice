package serialVersionUID;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Arun on 2/26/16.
 */
public class WriteObect {

    public static void main(String[] args){

        Member member = new Member();
       member.setFirstName("John");
        member.setLastName("Doe");

        try {
            FileOutputStream fout = new FileOutputStream("/Users/Arun/Desktop/member.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(member);
            oos.close();
            System.out.println("done");

        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
