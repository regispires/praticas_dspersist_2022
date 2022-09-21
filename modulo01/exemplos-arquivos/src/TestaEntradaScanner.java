import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaEntradaScanner {
    
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        Scanner entrada = new Scanner(is);
        PrintStream ps = new PrintStream(new FileOutputStream("arquivo.txt", true));
        while (entrada.hasNextLine()) {
            String s = entrada.nextLine();
            System.out.println(s);
            ps.println(s);
        }
        is.close();
        ps.close();
      }
        
}
