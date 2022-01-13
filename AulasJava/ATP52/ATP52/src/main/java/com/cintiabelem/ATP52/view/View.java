package com.cintiabelem.ATP52.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.cintiabelem.ATP52.dao.CategoriaDao;
import com.cintiabelem.ATP52.dao.ConnectionFactory;
import com.cintiabelem.ATP52.model.Categoria;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		create();

		delete();

		read();

		update();
	}

	private static void delete() {
		try (Connection conn = new ConnectionFactory().getConnection()) {
			CategoriaDao cd = new CategoriaDao(conn);
			cd.delete(9);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("erro ao acessar o banco");
		}
	}

	private static void read() {
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

	private static void create() {
		try (Connection conn = new ConnectionFactory().getConnection()) {
			CategoriaDao cd = new CategoriaDao(conn);
			Categoria cat1 = new Categoria("notebook", "notebook fodão");
			cd.create(cat1);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("erro ao acessar o banco");
		}
	}

	private static void update() {
		// TODO Auto-generated method stub
		try (Connection conn = new ConnectionFactory().getConnection()) {
			CategoriaDao cd = new CategoriaDao(conn);
			Categoria cat1 = new Categoria(23, "notebook atualizado", "notebook fodão novão");
			cd.update(cat1);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("erro ao acessar o banco");
		}

	}

}
