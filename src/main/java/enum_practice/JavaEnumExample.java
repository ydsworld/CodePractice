package enum_practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;


public class JavaEnumExample {

    private static final Logger logger = LoggerFactory.getLogger(JavaEnumExample.class);


    public static void main(String args[]) {

        // EnumMap is a special high performance map to store Enum constrants
        Map<SoftDrink, Integer> store = new EnumMap<SoftDrink, Integer>(SoftDrink.class);

        // Let's initialize store, by storing 10 canes of each drink
        // Enum provides an implicit values() method, which can be used to iterate over Enum
        for (SoftDrink drink : SoftDrink.values()) {
            store.put(drink, 10);
        }

        System.out.println(SoftDrink.THUMPS_UP);

        // let's print what is in EnumStore
        for(Map.Entry<SoftDrink, Integer> entry: store.entrySet()){
            logger.info(entry.getKey() + " Qty: " + entry.getValue()

                    + " Price: " + entry.getKey().getPrice());
        }

        Map<SoftDrink, String> enumtest = new HashMap<>();

        enumtest.put(SoftDrink.COKE, "This is coke");
        enumtest.put(SoftDrink.LIME, "This is Limka");

        if(enumtest.containsKey(SoftDrink.COKE)){
            System.out.printf("Coke te");
        } else {
            System.out.printf("not ofund");
        }


    } //main
} //class