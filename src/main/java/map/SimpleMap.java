package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleMap {
 public static void main(String[] args) {
	//Create HashMap
     Map<String , String> studentGrades = new HashMap<String, String>();
	// comment       
     //Add Key/Value pairs
     studentGrades.put("Alvin", "A+");
     studentGrades.put("Alan", "A");
     studentGrades.put("Becca", "A-");
     studentGrades.put("Sheila", "B+");
     
     //find element using key
    // System.out.println("Becca's Marks:: "+studentGrades.get("Becca"));
     
     //remove element
     //studentGrades.remove("Becca");
     
     //Iterate over HashMap
     for(String key: studentGrades.keySet()){
   //      System.out.println(key  +" :: "+ studentGrades.get(key));
     }
     
     System.out.println("");
     //create hashmap
     Map<String, Integer> studentMarks = new HashMap<String, Integer>();
     //add key value
     studentMarks.put("Alvin", 99);
     studentMarks.put("Kevin", 83);
     studentMarks.put("private", 78);
     
    // System.out.println("Alvin Makrs : " + studentMarks.get("Alvin"));
     
     for(String key:studentMarks.keySet()){
    //	 System.out.println(key + "::" + studentMarks.get(key));
     }


     //putting Values of Map to Arrarylist
     List<String> al = new ArrayList<>(studentGrades.values());
     for(String str: al){
         System.out.println(str);
     }
 }

}
