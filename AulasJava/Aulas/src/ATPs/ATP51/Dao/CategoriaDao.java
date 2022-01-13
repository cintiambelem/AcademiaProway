package ATP51.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ATP51.model.Categoria;
import ATP51.utils.ConnectionFactory;

public class CategoriaDao {
    private Connection conn;

    public CategoriaDao(Connection conn) {
        this.conn = conn;
    }

    public void create(Categoria model) throws SQLException {

        PreparedStatement prepStatement = conn.prepareStatement("INSERT INTO categoria (nome, descricao) values (?, ?)",
                Statement.RETURN_GENERATED_KEYS);

        prepStatement.setString(1, model.getNome());
        prepStatement.setString(2, model.getDescricao());

        prepStatement.execute();

        ResultSet ids = prepStatement.getGeneratedKeys();

        while (ids.next()) {

            int id = ids.getInt("id");

            System.out.printf("\nCategoria com id nº: %s inserido com sucesso! ", id);
        }
    }

    public int update(Categoria model) throws SQLException {

        // int linhasAtualizadas = 0;

        String sqlUpdate = "UPDATE categoria SET nome = ? WHERE id = ?";
        PreparedStatement prepStatement = conn.prepareStatement(sqlUpdate);
        prepStatement.setString(1, model.getNome());
        prepStatement.setInt(2, model.getId());
        prepStatement.execute();

        // linhasAtualizadas = prepStatement.getUpdateCount();
        System.out.println(prepStatement.getUpdateCount());
        
        return prepStatement.getUpdateCount();
    }

    public int delete(int id) {
        int linhasDeletadas = 0;

        String sqlDelete = "DELETE FROM categoria WHERE id =?";

        try (PreparedStatement prepStatement = conn.prepareStatement(sqlDelete)) {
            prepStatement.setInt(1, id);
            prepStatement.execute();
            linhasDeletadas = prepStatement.getUpdateCount();

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return linhasDeletadas;
    }

    public ArrayList<Categoria> read() throws SQLException {
        ArrayList<Categoria> list = new ArrayList<Categoria>();

        PreparedStatement prepStatement = conn.prepareStatement("SELECT id, nome, descricao from categoria");

        prepStatement.execute();

        ResultSet result = prepStatement.getResultSet();

        while (result.next()) {

            // os nomes dos results devem ser identicos aos registrados no banco
            Categoria model = new Categoria(result.getInt("id"), result.getString("nome"),
                    result.getString("descricao"));
            list.add(model);
        }
        return list;
    }

}
