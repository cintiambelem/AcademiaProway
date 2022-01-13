package ATP46;

import java.sql.Connection;
import java.sql.DriverManager;
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
            Connection conn = DriverManager.getConnection(connectionString, user, pwd);

            Statement statement = conn.createStatement();

            //_ _  Na classe2, insira um novo produto na tabela e imprima o id gerado.

            String sqlInsert = "INSERT INTO produto (nome, descricao, preco, categoria_id) values ('bicicleta', 'caloi 360', 1000.00, 1)";
            statement.execute(sqlInsert);

            ResultSet result = statement.getResultSet();

            statement.execute(sqlInsert, statement.RETURN_GENERATED_KEYS);

            ResultSet ids = statement.getGeneratedKeys();

            while (ids.next()) {

                int id = ids.getInt(1);

                System.out.printf("\nProduto com id nº: %s inserido com sucesso! ",id);

            }

            

        } catch (SQLException e) {
           
            e.printStackTrace();
            System.out.println("erro ao acessar o banco");
        }
    }
}
