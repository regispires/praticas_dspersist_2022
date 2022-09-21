import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class LeEscreveTexto {
    
    public static void main(String[] args) throws Exception {
        System.setProperty("console.encoding", "UTF-8");
        System.out.println("Teste ação");
        System.out.println(Charset.defaultCharset().displayName());        
        //System.out.println(s);
        Charset[] charsets = { 
            null,
            Charset.defaultCharset(),
            StandardCharsets.ISO_8859_1, 
            StandardCharsets.US_ASCII,
            StandardCharsets.UTF_8,  
            //StandardCharsets.UTF_16LE,
            //StandardCharsets.UTF_16,
            //StandardCharsets.UTF_16BE,
        };
        //System.out.println("ação".getBytes());
        //System.out.println("-ação");
        //convertStringToHex("ação");
        //System.out.println(s);
        //convertStringToHex(s);
        //System.out.println(s.getBytes());
        Scanner scanner = null;
        for (Charset c : charsets) {
            if (c != null) {
                System.out.println(c.name());
                scanner = new Scanner(System.in, c);
            } else {
                System.out.println("null");
                scanner = new Scanner(System.in);
            }
            if (scanner.hasNext()) {
                String s = scanner.nextLine();
                convertStringToHex("açãoªº");
                convertStringToHex(s);
                for (Charset c1 : charsets) {
                    if (c1 != null) {
                        convertStringToHex(new String(s.getBytes(), c1));
                    }
                }
            }
        }
        scanner.close();
    }

    private static void convertStringToHex(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            String charToHex = Integer.toHexString(c);
            stringBuilder.append(charToHex);
        }

        System.out.println("Converted Hex from String: "+stringBuilder.toString());
    }    
}
