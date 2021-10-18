package baseline;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.io.PrintWriter;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution42Test {

    @Test
    void main() throws IOException {
        ArrayList<String> employee = new ArrayList<>();
        String temp;
        BufferedReader readFile = new BufferedReader(new FileReader("data/exercise42_input.txt"));
        while((temp = readFile.readLine()) != null){
            String[] comma = temp.split(",");
            employee.add(comma[0]);
            employee.add(comma[1]);
            employee.add(comma[2]);
        }
        FileWriter fileWrite = new FileWriter("data/testOut.txt");
        PrintWriter write = new PrintWriter(fileWrite);
        write.println("Last\tFirst\tSalary\n--------------------------");
        int j = 1;
        for (String s : employee) {

            write.printf("%-10s", s);
            if (j == 3) {
                write.print("\n");
                j = 1;
            } else {
                j++;
            }
        }
        write.close();
        BufferedReader readFile2 = new BufferedReader(new FileReader("data/testingData.txt"));
        ArrayList<String> printed = new ArrayList<>();
        while((temp = readFile2.readLine()) != null){
            printed.add(temp);
        }
        BufferedReader readFile3 = new BufferedReader(new FileReader("data/testOut.txt"));
        ArrayList<String> correct = new ArrayList<>();
        while((temp = readFile3.readLine()) != null){
            correct.add(temp);
        }
        assertEquals(printed, correct);
        /*
        Test Fails due to extra space printed after first number. Only happens in that line
         */
    }
}