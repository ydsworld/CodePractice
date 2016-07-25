package interviewq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by YDS on 6/18/16.
 */
public class ReverseWords {
    public static void main(String args[]) throws IOException{
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String strArr[] = null;
        List<String[]> strArrList = new ArrayList<>();
        while ((line = buffer.readLine()) != null){
            strArr = line.split(" ");
            strArrList.add(strArr);
        }

        for (String[] strArr1:strArrList){
            for (int i = strArr1.length-1; i >= 0 ; i--) {
                System.out.print(strArr1[i]);
                if(i!=0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    } //main
}
