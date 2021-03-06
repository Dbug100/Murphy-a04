package challenges;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NameSorter {
    void sorter(Scanner file, ArrayList<String> names) throws IOException {
        //while file has another line add name to list
        while(file.hasNextLine()){
            names.add(file.nextLine());
        }

        //use java built-in sort function to sort list
        names.sort(String.CASE_INSENSITIVE_ORDER);
        printNames(names);

    }
    private void printNames(ArrayList<String> names) throws IOException {
        //open output file
        try (FileWriter list = new FileWriter("data/exercise41_output.txt")) {

            //print number of names
            int length = names.size();
            list.write("Total of " + length + " names\n-----------------\n");

            //create for loop to print arraylist
            for (String name : names) {
                list.write(name +"\n");
            }

            //close output file
            //closes automatically with try

        }
    }
}
