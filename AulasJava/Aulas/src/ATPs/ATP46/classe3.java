package ATP46;

import java.sql.Connection;
import java.sql.DriverManager;
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
            Connection conn = DriverManager.getConnection(connectionString, user, pwd);

            Statement statement = conn.createStatement();
            // _  Na classe3, altere todos os produtos para a mesma categoria e exiba a quantidade de linhas afetadas.

            String sqlUpdate = "UPDATE produto SET categoria_id = '1'";
            statement.execute(sqlUpdate);

            int linhasAtualizadas = statement.getUpdateCount();
            System.out.println(linhasAtualizadas);
            conn.close();

        } catch (SQLException e) {

            e.printStackTrace();
            System.out.println("erro ao acessar o banco");
        }

    }

}
