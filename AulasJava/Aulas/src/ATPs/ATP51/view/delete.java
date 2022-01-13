package ATP51.view;


import java.sql.Connection;
import ATP51.Dao.CategoriaDao;

import ATP51.utils.ConnectionFactory;
public class delete {
    public static void main(String[] args) {

        
        try (Connection conn = new ConnectionFactory().getConnection()) {
            CategoriaDao cd = new CategoriaDao(conn);
            cd.delete(9);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("erro ao acessar o banco");
        }
    }
    
}
