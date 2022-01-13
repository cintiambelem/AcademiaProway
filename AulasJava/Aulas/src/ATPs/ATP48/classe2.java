package ATP48;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class classe2 {
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
            //_  Altere a classe2 para receber os parâmetros nome e descrição através de variáveis e troque o Statement para PreparedStatement.

            String nome = "carros";
            String descricao = "carrão";

            Connection conn = DriverManager.getConnection(connectionString, user, pwd);
            

            PreparedStatement prepStatement = conn.prepareStatement("INSERT INTO categoria (nome, descricao) values (?, ?)", Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, nome);
            prepStatement.setString(2, descricao);
    
     
            prepStatement.execute();

            ResultSet ids = prepStatement.getGeneratedKeys();

            while (ids.next()) {

                int id = ids.getInt(1);

                System.out.printf("\nCategoria com id nº: %s inserido com sucesso! ",id);

            }
        } catch (SQLException e) {
           
            e.printStackTrace();
            System.out.println("erro ao acessar o banco");
        }

        
    }
    
}
