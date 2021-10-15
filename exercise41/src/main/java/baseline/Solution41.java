package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Deaja Murphy
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution41 {
    public void main(String[] args) throws FileNotFoundException {
        //create scanner
        Scanner file = new Scanner(new File("exercise41_input.txt"));
        //create arraylist to store names
        ArrayList<String> names = new ArrayList<>();
        //call name sorter
        nameSorter(file, names);
        //close input file
    }

    private void nameSorter(Scanner file, ArrayList<String> names) {
        //while file has another line add name to list
        //use java built-in sort function to sort list

    }

    private class printNames{
        //open output file
        //print number of names
        //create for loop to print arraylist
        //close output file
    }
}
