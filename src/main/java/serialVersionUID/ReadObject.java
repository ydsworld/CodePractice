package serialVersionUID;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by Arun on 2/26/16.
 */
public class ReadObject {
    public static void main(String[] args){


        Member member;

        try{
            FileInputStream fin = new FileInputStream("/Users/Arun/Desktop/member.ser");
            ObjectInputStream ois = new ObjectInputStream(fin);
            member = (Member) ois.readObject();
            ois.close();

            System.out.println(member);


        } catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
