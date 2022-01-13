package com.cintiabelem.atp56.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cintiabelem.atp56.models.CategoriaModel;

public class CategoriaDao {

    public int insert(CategoriaModel model) {
        int id = 0;

        try (Connection conn = new ConnectionFactory().getConnection()) {

            PreparedStatement prepStatement = conn.prepareStatement(
                    "INSERT INTO categoria (nome, descricao) values (?, ?)", Statement.RETURN_GENERATED_KEYS);

            prepStatement.setString(1, model.getNome());
            prepStatement.setString(2, model.getDescricao());

            prepStatement.execute();

            ResultSet ids = prepStatement.getGeneratedKeys();

            while (ids.next()) {
                id = ids.getInt("id");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    public int update(CategoriaModel model) {

        int linhasAtualizadas = 0;
        try (Connection conn = new ConnectionFactory().getConnection()) {

            String sqlUpdate = "UPDATE categoria SET nome = ? WHERE id = ?";
            PreparedStatement prepStatement = conn.prepareStatement(sqlUpdate);
            prepStatement.setString(1, model.getNome());
            prepStatement.setInt(2, model.getId_categoria());
            prepStatement.execute();

            linhasAtualizadas = prepStatement.getUpdateCount();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return linhasAtualizadas;
    }

    public int delete(int id) {
        int linhasDeletadas = 0;

        try (Connection conn = new ConnectionFactory().getConnection()) {
            String sqlDelete = "DELETE FROM categoria WHERE id =?";

            try (PreparedStatement prepStatement = conn.prepareStatement(sqlDelete)) {
                prepStatement.setInt(1, id);
                prepStatement.execute();
                linhasDeletadas = prepStatement.getUpdateCount();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return linhasDeletadas;
    }

    public ArrayList<CategoriaModel> read() {
        ArrayList<CategoriaModel> list = new ArrayList<CategoriaModel>();
        try (Connection conn = new ConnectionFactory().getConnection()) {
            PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM categoria");
            prepStatement.execute();
            ResultSet result = prepStatement.getResultSet();
            list = createList(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<CategoriaModel> read(String nome) {
        ArrayList<CategoriaModel> list = new ArrayList<CategoriaModel>();

        try (Connection conn = new ConnectionFactory().getConnection()) {
            PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM categoria WHERE nome = ?");
            prepStatement.setString(1, nome);
            prepStatement.execute();
            ResultSet result = prepStatement.getResultSet();
            list = createList(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    private ArrayList<CategoriaModel> createList(ResultSet result) throws SQLException {
        ArrayList<CategoriaModel> list = new ArrayList<CategoriaModel>();
        while (result.next()) {

            // os nomes dos results devem ser identicos aos registrados no banco
            CategoriaModel model = new CategoriaModel();
            model.setId_categoria(result.getInt("id"));
            model.setNome(result.getString("nome"));
            model.setDescricao(result.getString("descricao"));
            list.add(model);
        }
        return list;
    }
}