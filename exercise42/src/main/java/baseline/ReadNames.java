package baseline;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadNames {
    void readNames(BufferedReader file, ArrayList<String> employee) throws IOException {
        String temp;
        /*loop through file use commas to separate
            first name, last name, and salary add to array list*/
        while((temp = file.readLine()) !=null){
            String[] comma = temp.split(",");
            employee.add(comma[0]);
            employee.add(comma[1]);
            employee.add(comma[2]);
        }
    }
    void printNames(ArrayList<String> employee){
        int j = 1;
        //print header
        System.out.println("Last\tFirst\tSalary\n--------------------------");
        //print array values
        // new line every 3 values
        for (String s : employee) {

            System.out.printf("%-10s", s);
            if (j == 3) {
                System.out.print("\n");
                j = 1;
            } else {
                j++;
            }
        }


    }
}
