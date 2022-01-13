/*_  Utilize as tabelas e os registros criados durante as atividades ATP41 e ATP42.
_  Crie uma conexão com o banco de dados postgresql utilizando JDBC(java.sql.*).
_  Crie 4 classes para realizar as 4 operações de CRUD.
_  Na classe1, liste id e nome de todas as linhas da tabela Categoria.
_  Na classe2, insira uma nova Categoria e imprima o id gerado.
_  Na classe3, altere o nome da primeira e segunda categoria da tabela e exiba a quantidade de linhas afetadas.
_  Na classe4, delete as ultimas categorias cadastradas.*/

package ATP47;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class view {
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
        } catch (SQLException e) {
           
            e.printStackTrace();
        }
    }
    
}
