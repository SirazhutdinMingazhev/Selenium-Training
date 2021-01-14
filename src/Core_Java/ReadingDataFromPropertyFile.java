package Core_Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingDataFromPropertyFile {

    public static void main(String[] args) throws IOException {
        File f=new File("/Users/sirazhutdinmingazhev/IdeaProjects/SeleniumProject/configuratiomn.properties");
        FileInputStream fi=new FileInputStream(f);
        Properties prop=new Properties();
        prop.load(fi);

       // prop.getProperty("browsername");
        System.out.println(prop.getProperty("browsername"));
        System.out.println(prop.getProperty("appurl"));

        fi.close();
    }


}
