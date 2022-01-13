package ATP49.view;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

            //ltere a classe4 para receber o Id da categorias a ser deletada através de variável e troque o Statement para PreparedStatement..

            int id = 3;

            Connection conn = DriverManager.getConnection(connectionString, user, pwd);
                        
            String sqlDelete = "DELETE FROM categoria WHERE id =?";
            
            PreparedStatement prepStatement = conn.prepareStatement(sqlDelete);
            prepStatement.setInt(1, id);
            
            prepStatement.execute();
     
            int linhasDeletadas = prepStatement.getUpdateCount();
            System.out.println(linhasDeletadas);
            conn.close();

            
        } catch (SQLException e) {
           
            e.printStackTrace();
            System.out.println("erro ao acessar o banco");
        }
        
    }
    
}
