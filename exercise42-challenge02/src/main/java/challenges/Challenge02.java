package challenges;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Deaja Murphy
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Challenge02 {
    public static void main(String[] args) throws IOException {
        Challenge02 app = new Challenge02();
        //open file
        BufferedReader file = new BufferedReader(new FileReader("data/exercise42_input.txt"));
        ArrayList<String> employee = new ArrayList<>();

        //call readNames
        app.readNames(file, employee);
        //call printNames
        app.printNames(employee);
        //close input file
        file.close();
    }
    private void readNames(BufferedReader file, ArrayList<String> employee) throws IOException {
        String temp;
        /*loop through file use commas to separate
            first name, last name, and salary add to array list*/
        while((temp = file.readLine()) !=null){
            String[] comma = temp.split(",");
            String money = comma[2];
            String s1 = money.substring(0,2);
            String s2 = money.substring(2,5);
            money= "$"+s1+","+s2;
            employee.add(comma[0]);
            employee.add(comma[1]);
            employee.add(money);

        }
    }
    private void printNames(ArrayList<String> employee){
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
