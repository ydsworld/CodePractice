package interviewq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;


/**
 Your program should accept a path to a file as its first argument. The file contains multiple lines.
 The first line indicates the number of lines you should output, the other lines are of different length and are presented randomly.
 You may assume that the input file is formatted correctly and the number in the first line is a valid positive integer.
 */
public class LongestLines {
    public static void main(String args[]) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;

        while ((line = buffer.readLine()) != null){

        }



        int firstline=0, noOfLongestLines=0;

        List<String> lines = new ArrayList<>();

        while ((line = buffer.readLine()) != null){
            if(firstline==0) {
                noOfLongestLines = Integer.parseInt(line);

            }

            if(firstline!=0) lines.add(line);
            firstline=1;
        } //while file read

    bubbleSort(lines);

        for (int i = 0; i <=noOfLongestLines-1 ; i++) {
            System.out.println(lines.get(i));
        }

    } //main

    public static List<String> bubbleSort(List<String> list){
        for (int lastIndex=list.size()-1; lastIndex >= 0; lastIndex--){
            for (int i=0; i<lastIndex; i++){
                String first = list.get(i);
                String second = list.get(i+1);

                //Swap?
                if (first.length() < second.length()){
                    list.set(i, second);
                    list.set(i+1, first);
                }
            }
        }
        return list;
    }

}
