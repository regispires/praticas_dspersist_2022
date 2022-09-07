import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeTexto {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("/Users/regis/tmp/teste.txt");
       
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine(); // primeira linha
    
        while (s != null) {
          System.out.println(s);
          s = br.readLine();
        }
    
        br.close();
      }
    
    
  }
  