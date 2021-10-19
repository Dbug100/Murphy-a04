package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMaker {
    private File jsFile;
    private File cssFile;
    String path = "data/./website/";
    String out = "Created ";
    void fileMaker(String site, char js, char css) {
        // use FileWriter to create file
        // make file - site name
        File file = new File((path + site));
        if(file.exists() && file.isDirectory()){
            System.out.println(out + file);
        }
        // if user answered y or Y to using js
        // file - site - js
        if (js == 'y' || js == 'Y')
            jsFile = new File((path+"js/"));
        if(jsFile.exists() && jsFile.isDirectory()){
            System.out.println(out +jsFile);
        }
        // if user answered y or Y to using CSS
        //file - site - css
        if (css == 'y' || css == 'Y')
            cssFile = new File((path+"css/"));
        if(cssFile.exists() && cssFile.isDirectory()){
            System.out.println(out +cssFile);
        }
    }
    void html(String site, String auth) throws IOException {
        //create file - user - html
        File htmlFile = new File((path + site + "/index.html"));
        try (FileWriter hFile = new FileWriter((path + site + "/index.html"))) {
            //list.write site name
            hFile.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
            hFile.write("\t<title>" + site + "</title>\n");
            //list.write author
            hFile.write("\t<meta author=\"" + auth + "\">\n");

        }
        if(htmlFile.exists() && htmlFile.isDirectory()){
            System.out.println(out +cssFile);
        }

    }
}
