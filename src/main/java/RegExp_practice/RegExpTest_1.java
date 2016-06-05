package RegExp_practice;

import utils.Utils;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Arun on 5/28/16.
 */
public class RegExpTest_1 {

    public static void main(String[] args){


        ArrayList<String> list = new ArrayList<String>();
        list.add("item1");
        list.add("item2");
        list.add("item3");
        list.add("item4");
        list.add("#item5");

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("item1");
        list1.add("item2");
        list1.add("#item3");
        list1.add("item4");
        list1.add("item5");

//        List<String> str =
//        Stream.of(list, list1)
//                .map(Utils::finditem)
//                .filter(x -> !x.isEmpty())
//                .collect(Collectors.toList());

//        if (!str.isEmpty()){
//            for(String s : str){
//                System.out.println(s);
//            }
//
//        }
//

        String str =
                Stream.of(list, list1)
                .map(Utils::finditem)
                .filter(x -> !x.isEmpty())
                .collect(Collectors.joining(" "));


        if (!str.isEmpty()) {
            System.out.println(str);
        } else {
            System.out.println("empty");
        }

        //        .forEach(items -> System.out.println("List : \n" + items));



//        List<Person> filtered =
//                persons
//                        .stream()
//                        .filter(p -> p.name.startsWith("P"))
//                        .collect(Collectors.toList());
//
//        System.out.println(filtered);


    } //main
//    public static String finditem(ArrayList<String> alist){
//        StringBuilder sb = new StringBuilder();
//        String re1=".*?";	// Non-greedy match on filler
//        String re2="(^#|^&)";	// Word 1
//        Pattern p = Pattern.compile(re1+re2,Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
//
//        for(String str:alist){
//
//            Matcher m = p.matcher(str);
//            if (m.find())
//            {
//              //  System.out.println("found" + m.group(1));
//                sb.append(str);
//                sb.append("\n");
//            } else {
//               // System.out.print("not found");
//            }
//        }
//
//        return sb.toString();
//    }
}
