package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test{
    @Test
    void main() throws FileNotFoundException {
        //create scanner
        Scanner file = new Scanner(new File("data/exercise41_input.txt"));
        ArrayList<String> names = new ArrayList<>();
        //File results = new File("resources/testingData.txt");
        while(file.hasNextLine()){
            names.add(file.nextLine());
        }
        //use java built-in sort function to sort list
        names.sort(String.CASE_INSENSITIVE_ORDER);
        Scanner results = new Scanner(new File("data/testingData.txt"));
        ArrayList<String> list = new ArrayList<>();
        while(results.hasNextLine()){
            list.add(results.nextLine());
        }
            assertEquals(names, list);
    }
}