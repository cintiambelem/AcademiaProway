package ATP48;
//Na classe3, altere o nome da primeira e segunda categoria da tabela e exiba a quantidade de linhas afetadas.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class classe3 {
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

            //Altere a classe3 para  receber os nomes das categorias que serão alteradas, através de variáveis e troque o Statement para PreparedStatement.
            
            String nome = "novacategoria";
            int id = 3;

            Connection conn = DriverManager.getConnection(connectionString, user, pwd);
            
            String sqlUpdate = "UPDATE categoria SET nome = ? WHERE id = ?";
            PreparedStatement prepStatement = conn.prepareStatement(sqlUpdate);
            prepStatement.setString(1, nome);
            prepStatement.setInt(2, id);
            prepStatement.execute();
     
            int linhasAtualizadas = prepStatement.getUpdateCount();
            System.out.println(linhasAtualizadas);
            conn.close();

            
        } catch (SQLException e) {
           
            e.printStackTrace();
            System.out.println("erro ao acessar o banco");
        }
        

        
    }
    
}
