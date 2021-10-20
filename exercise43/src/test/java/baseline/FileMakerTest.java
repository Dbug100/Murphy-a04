package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileMakerTest {

    @Test
    void fileMaker() throws IOException {
        File jsFile = null;
        File cssFile = null;
        char js = 'y';
        char css = 'y';
        String site = "awesomeco";
        String path = "data/";
        String out = "Created ";
        // use FileWriter to create file
        // make file - site name
        File file = new File((path + site));
        if (file.mkdir()) {
            System.out.println(out + file);
        }
        // if user answered y or Y to using js
        // file - site - js
        if (js == 'y' || js == 'Y')
            jsFile = new File((path + site + "/js"));
        if (jsFile.mkdir()) {
            System.out.println(out + jsFile);
        }
        // if user answered y or Y to using CSS
        //file - site - css
        if (css == 'y' || css == 'Y')
            cssFile = new File((path + site + "/css"));
        if (cssFile.mkdir()) {
            System.out.println(out + cssFile);
        }
        assertEquals("Created data\\awesomeco\\css", out + cssFile);

    }
}

class FileMakerTestJS {
    @Test
    void fileMaker() throws IOException {
        File jsFile = null;
        File cssFile = null;
        char js = 'y';
        char css ='y';
        String site = "awesomeco";
        String path = "data/";
        String out = "Created ";
        // use FileWriter to create file
        // make file - site name
        File file = new File((path + site));
        if(file.mkdir()){
            System.out.println(out + file);
        }
        // if user answered y or Y to using js
        // file - site - js
        if (js == 'y' || js == 'Y')
            jsFile = new File((path+site+"/js"));
        if(jsFile.mkdir()){
            System.out.println(out +jsFile);
        }
        // if user answered y or Y to using CSS
        //file - site - css
        if (css == 'y' || css == 'Y')
            cssFile = new File((path+site+"/css"));
        if(cssFile.mkdir()){
            System.out.println(out +cssFile);
        }
        assertEquals("Created data\\awesomeco\\js", out +jsFile);

    }
}
class FileMakerHTML{
    @Test
    void html() throws IOException {
        FileMaker test = new FileMaker();
        String site = "awesomeco";
        String auth = "Max Power";
        String path = "data/";
        String out = "Created ";
        File cssFile = null;
        cssFile = new File((path+site+"/css"));
        if(cssFile.mkdir()){
            System.out.println(out +cssFile);
        }
        //create file - user - html
        File htmlFile = new File((path + site + "/index.html"));
        if(htmlFile.mkdir()) {
            System.out.print(htmlFile);
        }
            try  {
            FileWriter hFile = new FileWriter(htmlFile);
            //list.write site name
            hFile.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
            hFile.write("\t<title>" + site + "</title>\n");
            //list.write author
            hFile.write("\t<meta author=\"" + auth + "\">\n");
        }catch(IOException e){
                //error couldn't write
            }
        if(htmlFile.mkdirs()){
            System.out.println(out +cssFile);
        }
        assertEquals("Created data\\awesomeco\\index.html", out +htmlFile.getPath());
    }
}