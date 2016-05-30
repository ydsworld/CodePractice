package interviewq;

import java.io.*;

/**
 * Created by YDS on 5/30/16.
 */
public class FizzBuzz {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] array = line.split(" ");
            try {
                int X = Integer.parseInt(array[0]);
                int Y = Integer.parseInt(array[1]);
                int N = Integer.parseInt(array[2]);

                for (int i=1; i<=N; i++){
                    if(i % X == 0) {
                        System.out.print("F");
                    } else if (i % Y ==0 ){
                        System.out.print("B");
                    } else if ((i % Y == 0 ) && (i % Y ==0)){
                        System.out.print("FB");
                    } else {
                        System.out.print(i);
                    }
                    if (i !=N) System.out.print(" ");
                } //for N

                System.out.println("");

            } catch (Exception e)
            {
                System.out.println("Parse Integer " + e.toString());
            }



        } //while eof
    } //main

}
