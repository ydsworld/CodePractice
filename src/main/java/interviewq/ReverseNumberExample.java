package interviewq;

/**
 * Created by YDS on 6/18/16.
 */
public class ReverseNumberExample {

    public static void main(String args[]){


        System.out.println(reverse(12345));


    }

    /*
     * reverse a number in Java using iteration
     * @return reverse of number
     */
    public static int reverse(int number){
        int reverse = 0;
        int remainder = 0;
        do{
            remainder = number%10;
            reverse = reverse*10 + remainder;
            number = number/10;

        }while(number > 0);

        return reverse;
    }


}
