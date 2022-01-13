package ATP46;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class classe1 {
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

            //_  Na classe1, liste todos os dados de todas as colunas da tabela produto.

            String sqlConsulta = "SELECT id, nome, descricao from produto";
            statement.execute(sqlConsulta);

            ResultSet result = statement.getResultSet();

            while(result.next()){

                //os nomes dos results devem ser identicos ao registrado no banco
                int id = result.getInt("id");
                String nome = result.getString("nome");
                String descricao = result.getString("descricao");
                

                System.out.printf("%d - %s - %s\n", id, nome, descricao);
            }

        } catch (SQLException e) {
           
            e.printStackTrace();
            System.out.println("erro ao acessar o banco");
        }
    }
}
