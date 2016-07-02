package interviewq;

/**
 * Created by YDS on 6/18/16.
 */
public class PrimePalindrome {
    public static void main(String args[]){

        for (int i=1000; i>0; i--){
            if (isPrime(i) && isPalindrome(i)){
                System.out.println(i);
                break;
            }
        }

    } //main

    public static boolean isPrime(int num){
        if (num == 2)
            return true;
        for (int divisor = 2; divisor <= num/2; divisor++)
        {
            if (num % divisor == 0)
                return false;
        }
        return true;
    } //isPrime

    public static boolean isPalindrome(int number){
        int temp = number;
        if(temp == reverse(number)){
            return true;
        } else {
            return false;
        }
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

}  //class
