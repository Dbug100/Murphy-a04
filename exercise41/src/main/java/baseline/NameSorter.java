package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class NameSorter {
    void sorter(Scanner file, ArrayList<String> names) {
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
