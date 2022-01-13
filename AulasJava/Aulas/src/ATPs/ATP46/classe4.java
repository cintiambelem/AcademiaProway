package ATP46;

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
            //Na classe4, delete um produto pelo id.

            String sqlDelete = "DELETE FROM produto WHERE id = 16";
            statement.execute(sqlDelete);
     
            
            conn.close();

            
        } catch (SQLException e) {
           
            e.printStackTrace();
            System.out.println("erro ao acessar o banco");
        }
        
    }
    
}
