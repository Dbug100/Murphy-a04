package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Deaja Murphy
 */
//create actual files or just print the desired output?

import java.util.Scanner;

public class Solution43 {

    public static void main(String[] args)  {
        //create scanner
        Scanner userIn = new Scanner(System.in);
        //prompt user
        System.out.print("Site name: ");
        String siteName = userIn.nextLine();
        System.out.print("Author: ");
        String author = userIn.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        char js = userIn.next().charAt(0);
        System.out.print("Do you want a folder for CSS? ");
        char css = userIn.next().charAt(0);
        //call fileMaker
        FileMaker fm = new FileMaker();
        fm.fileMaker(siteName, js, css);
        //call Html
        fm.html(siteName, author);
    }


}
