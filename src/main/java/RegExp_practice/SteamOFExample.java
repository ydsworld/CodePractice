package RegExp_practice;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Arun on 5/28/16.
 */
public class SteamOFExample {
    public static void main(String[] args){
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
                .stream().
                filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
