package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by arun on 1/4/18.
 */
public class DateFormats {
    public static void main(String[] args){

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
        String dateInString = "0001-01-01";

        try {

            Date date = formatter.parse(dateInString);
            System.out.println(date);
            System.out.println(formatter.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
