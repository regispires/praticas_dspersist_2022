import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LeProp {

  public static void main(String[] args) {
    Properties prop = new Properties();

    try {
      prop.load(LeProp.class.getClassLoader()
        .getResourceAsStream("config.properties"));
      // get the property value and print it out
      System.out.println(prop.getProperty("database"));
      System.out.println(prop.getProperty("dbuser"));
      System.out.println(prop.getProperty("dbpassword"));

    } catch (IOException ex) {
      ex.printStackTrace();
    }
  } 
}
