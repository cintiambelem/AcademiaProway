package ATP47;
//_  Na classe4, delete as ultimas categorias cadastradas.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class classe4 {
    public static void main(String[] args) {
        String driverType = "jdbc";
        String driverName = "postgresql";
        String host = "localhost";
        int porta = 5432;
        String database = "postgres";

        String user = "postgres";
        String pwd = "123456";

        String connectionString = String.format("%s:%s://%s:%d/%s", driverType, driverName, host, porta, database);
        
        
        try {
            Connection conn = DriverManager.getConnection(connectionString, user, pwd);
            

            Statement statement = conn.createStatement();

            String sqlDelete = "DELETE FROM categoria WHERE id > 18";
            statement.execute(sqlDelete);
     
            int linhasDeletadas = statement.getUpdateCount();
            System.out.println(linhasDeletadas);
            conn.close();

            
        } catch (SQLException e) {
           
            e.printStackTrace();
            System.out.println("erro ao acessar o banco");
        }
        
    }
    
}
