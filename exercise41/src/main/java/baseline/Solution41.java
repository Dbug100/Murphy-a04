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
    public static void main(String[] args) throws FileNotFoundException {
        Solution41 call = new Solution41();
        //create scanner
        Scanner file = new Scanner(new File("data/exercise41_input.txt"));
        //create arraylist to store names
        ArrayList<String> names = new ArrayList<>();
        //call name sorter
         call.nameSorter(file, names);
        //close input file
        file.close();
    }

    private void nameSorter(Scanner file, ArrayList<String> names) {
        //while file has another line add name to list
        while(file.hasNextLine()){
            names.add(file.nextLine());
        }

        //use java built-in sort function to sort list
        names.sort(String.CASE_INSENSITIVE_ORDER);
        printNames(names);

    }
    private void printNames(ArrayList<String> names) {
        int length = names.size();
        System.out.println("Total of "+length +" names\n-----------------");

        for(int i = 0; i < length; i++){
            System.out.println(names.get(i));
        }



        //open output file
        //print number of names
        //create for loop to print arraylist
        //close output file
    }
}
