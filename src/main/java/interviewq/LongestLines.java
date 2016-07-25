package interviewq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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

    } //main
}
