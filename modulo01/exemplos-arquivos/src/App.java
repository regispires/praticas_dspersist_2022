import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("arquivo.txt");
        InputStreamReader isr = new InputStreamReader(is);

        char c = (char) isr.read();
        System.out.println();
        System.out.println("Hello, World!");
    }
}
