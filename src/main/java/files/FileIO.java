package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by AK on 7/7/17.
 */
public class FileIO {
    public static void main(String[] args){
        File licencefile = new File("/Users/AK/Downloads/license.txt");
        try{
            BufferedReader buffer = new BufferedReader(new FileReader(licencefile));
            String line;
            while ((line = buffer.readLine()) != null) {
                line = line.trim();
                break;
            }
            System.out.println(line);
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
