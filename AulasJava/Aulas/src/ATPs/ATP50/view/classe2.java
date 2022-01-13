package ATP50.view;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ATP49.utils.ConnectionFactory;

public class classe2 {
    public static void main(String[] args) {

        try (Connection conn = new ConnectionFactory().getConnection()) {

           PreparedStatement prepStatement = conn.prepareStatement("INSERT INTO categoria (nome, descricao) values (?, ?)", Statement.RETURN_GENERATED_KEYS);

                // _ Altere a classe2 para receber os parâmetros nome e descrição através de
                // variáveis e troque o Statement para PreparedStatement.

                String nome = "carros";
                String descricao = "carrão";

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
