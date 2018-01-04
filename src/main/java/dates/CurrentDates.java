package dates;

import stringManupulation.StringBuilderPractice;

import java.util.Calendar;

/**
 * Created by arun on 12/28/17.
 */
public class CurrentDates {
    public static void main(String[] args){
        int year = Calendar.getInstance().get(Calendar.YEAR);

        //System.out.println("args = [" + args + "]");
        System.out.println(year);
    }
}
