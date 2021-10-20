package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMaker {
    //private File jsFile;
    //private File cssFile;
    String path = "data/";
    String out = "Created ";
    void fileMaker(String site, char js, char css) {
        // use FileWriter to create file
        // make file - site name
        File file = new File((path + site));
        if (file.mkdir()) {
            System.out.println(out + file);
        }
        // if user answered y or Y to using js
        // file - site - js
        if (js == 'y' || js == 'Y'){
            File jsFile = new File((path + site + "/js"));
            if (jsFile.mkdir()) {
            System.out.println(out + jsFile);
            }
        }
        // if user answered y or Y to using CSS
        //file - site - css
        if (css == 'y' || css == 'Y'){
            File cssFile = new File((path + site + "/css"));
            if (cssFile.mkdir()) {
            System.out.println(out + cssFile);
            }
        }
    }
    void html(String site, String auth) {
        //create file - user - html
        File htmlFile = new File((path + site + "/index.html"));
        if(htmlFile.mkdir()) {
            System.out.print(htmlFile);
        }
        try  {
            try (FileWriter hFile = new FileWriter(htmlFile)) {
                //list.write site name
                hFile.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
                hFile.write("\t<title>" + site + "</title>\n");
                //list.write author
                hFile.write("\t<meta author=\"" + auth + "\">\n");
            }
        }catch(IOException e){
            //error couldn't write
        }
        if(htmlFile.mkdirs()){
            System.out.println(out +htmlFile.getPath());
        }

    }
}
