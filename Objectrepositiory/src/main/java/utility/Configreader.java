package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Manish on 6/30/2017.
 */
public class Configreader {
    Properties pro;
    public Configreader() throws IOException {
        File src = new File("./Configuration/config.property");
        FileInputStream fis = new FileInputStream(src);
        pro = new Properties();

        pro.load(fis);
    }

    public String getchromepath(){
        String path = pro.getProperty("ChromeDriver");
        return path;
    }

    public String getApplicationUrl(){
        return pro.getProperty("Url");
    }
}
