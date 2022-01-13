package ATP51.view;

import java.sql.Connection;
import ATP49.utils.ConnectionFactory;
import ATP51.Dao.CategoriaDao;
import ATP51.model.Categoria;

public class create {

    public static void main(String[] args) {

        try (Connection conn = new ConnectionFactory().getConnection()) {
            CategoriaDao cd = new CategoriaDao(conn);
            Categoria cat1 = new Categoria("notebook", "notebook fodão");
            cd.create(cat1);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("erro ao acessar o banco");
        }

    }

}
