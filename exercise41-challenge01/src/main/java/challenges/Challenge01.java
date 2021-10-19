package challenges;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Deaja Murphy
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Challenge01 {
    public static void main(String[] args) throws IOException {

        //create scanner
        Scanner file = new Scanner(new File("data/exercise41_input.txt"));
        //create arraylist to store names
        ArrayList<String> names = new ArrayList<>();
        //call name sorter
        NameSorter ns = new NameSorter();
        ns.sorter(file, names);
        //close input file
        file.close();
    }


}
