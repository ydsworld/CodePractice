package interviewq;

/**
 * Created by Arun on 2/25/16.
 */
public class Fibonacci {

    public static void main(String args[]){

        int num1 = 0;
        int num2 = 1;
        int febo = 1;

        System.out.println(num1);

        for (int i=1;i<=10;i++){

            System.out.println(febo);
            febo = num1 + num2;
            num1 = num2;
            num2 = febo;

        }

    }
}
