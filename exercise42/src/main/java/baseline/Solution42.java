package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Deaja Murphy
 */


import java.io.*;
import java.util.ArrayList;

public class Solution42 {
    public static void main(String[] args) throws IOException {

        //open file
        BufferedReader file = new BufferedReader(new FileReader("data/exercise42_input.txt"));
        ArrayList<String> employee = new ArrayList<>();

        //call readNames
        ReadNames rn = new ReadNames();
        rn.readNames(file, employee);
        //call printNames
        rn.printNames(employee);
        //close input file
        file.close();
    }

}
