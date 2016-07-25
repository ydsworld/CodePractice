package interviewq;

/**
 * Created by YDS on 6/18/16.
 */
public class SumofPrimeNumbers {
    public static void main(String args[]){
        int number=2;
        int count = 0;
        int sum = 0;
        while (count < 1000){
            if(isPrime(number)){
                sum += number;
                count ++;
            }
            number ++;
        }
        System.out.println(sum);

    } //main

    /* Check for Prime Number*/
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
} //class

