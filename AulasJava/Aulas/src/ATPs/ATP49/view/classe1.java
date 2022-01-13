package ATP49.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ATP49.utils.ConnectionFactory;

public class classe1 {
    public static void main(String[] args) {

        // Na classe1, liste id e nome de todas as linhas da tabela Categoria.

        try (Connection conn = new ConnectionFactory().getConnection()) {
            try (PreparedStatement prepStatement = conn.prepareStatement("SELECT id, nome, descricao from categoria")) {

                prepStatement.execute();

                ResultSet result = prepStatement.getResultSet();

                while (result.next()) {

                    // os nomes dos results devem ser identicos ao registrado no banco
                    int id = result.getInt("id");
                    String nome = result.getString("nome");
                    String descricao = result.getString("descricao");

                    System.out.printf("%d - %s - %s\n", id, nome, descricao);
                }
            }

        } catch (SQLException e) {

            e.printStackTrace();
            System.out.println("erro ao acessar o banco");
        }

    }

}
