package view;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class view {
    public static void main(String[] args) {
        //ligando com o banco de dados através da jdbc
        try {
            //criar uma string para salvar a url de acesso ao banco  e quebrar a url para facilitar a manutencao e visualizacao
            String driverType = "jdbc";
            String driverName = "postgresql";
            String host = "localhost";
            int port = 5432;
            String database = "postgres";

            String user = "postgres";
            String pwd = "123456";
            
            String connectionString = String.format("%s:%s://%s:%d/%s", driverType, driverName, host, port, database);
            
            Connection conn = DriverManager.getConnection(connectionString, user, pwd);
            //query sql
            Statement statement = conn.createStatement();
           String sql = "INSERT INTO cadastro_pessoa(nome, sobrenome, idade, endereco_id)values ('teste', 'java, 1, 2)";
            statement.execute(sql);

            //result = retorno da consulta
            ResultSet result = statement.getResultSet();

            //imprimindo resultado
            while (result.next()) {
                int id = result.getInt("id");
                String nome = result.getString("nome");
                String sobrenome = result.getString("sobrenome");
                System.out.printf("%d - %s %s\n", id, nome, sobrenome);                
            }
        
            conn.close();

        } catch (SQLException e) {
            
            e.printStackTrace();
        }
    }

    
}