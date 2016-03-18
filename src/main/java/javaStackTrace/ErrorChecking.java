package javaStackTrace;

/**
 * Created by Arun on 3/18/16.
 */
public class ErrorChecking {
    public static void main(String[] args){

        System.out.println("Starting Maith Method");
        m1();
        System.out.println("End of Main Method");
    }
//befor
//    static void m1(){
//        System.out.println("Method one -m1");
//        m2();
//    }
//    static void m2(){
//        int x = 10;
//        int y = 0;
//        double z = x / y;
//
//        System.out.println( z );
//        System.out.println("Method Two - m2");
//
//    }

    //after
    static void m1(){

        try {
            System.out.println("Method One - m1");
            m2( );
        }
        catch (ArithmeticException err) {
            System.out.println( err.getMessage( ) );
        }
    }
    static void m2(){
        int x = 10;
        int y = 0;
        double z = x / y;

        System.out.println( z );
        System.out.println("Method Two - m2");

    }
}
