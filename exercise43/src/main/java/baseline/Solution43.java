package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Deaja Murphy
 */
//create actual files or just print the desired output?

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution43 {
    private File jsFile;
    private File cssFile;

    public static void main(String[] args) throws IOException {
        Solution43 app = new Solution43();
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
        app.fileMaker(siteName, js, css);
        //call Html
        app.html(siteName, author);
    }

    private void fileMaker(String site, char js, char css) {
        // use FileWriter to create file
        // make file - site name

        File file = new File(("data/./website/" + site));
        if(file.exists() && file.isDirectory()){
            System.out.println("Created " + file);
        }
        // if user answered y or Y to using js
        // file - site - js
        if (js == 'y' || js == 'Y')
            jsFile = new File(("data/./website/js/"));
        if(jsFile.exists() && jsFile.isDirectory()){
            System.out.println("Created " +jsFile);
        }
        // if user answered y or Y to using CSS
        //file - site - css
        if (css == 'y' || css == 'Y')
            cssFile = new File(("data/./website/css/"));
        if(cssFile.exists() && cssFile.isDirectory()){
            System.out.println("Created " +cssFile);
        }
    }
    private void html(String site, String auth) throws IOException {
        //create file - user - html
        File htmlFile = new File(("data/./website/" + site + "/index.html"));
        try (FileWriter hFile = new FileWriter(("data/./website/" + site + "/index.html"))) {
            //list.write site name
            hFile.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
            hFile.write("\t<title>" + site + "</title>\n");
            //list.write author
            hFile.write("\t<meta author=\"" + auth + "\">\n");

        }
        if(htmlFile.exists() && htmlFile.isDirectory()){
            System.out.println("Created " +cssFile);
        }

    }
}
