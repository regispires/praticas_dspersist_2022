import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection(
            "jdbc:postgresql://localhost/contatos", 
            "postgres", "postgres");
        System.out.println("Conexão estabelecida com sucesso!!!");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from contatos");
        while (rs.next()) {
            System.out.println(rs.getInt("id") 
                + " - " + rs.getString("nome")
                + " - " + rs.getString("endereco"));
        }
        
        conn.close();
    }
}
