package ATP51.view;
//Na classe3, altere o nome da primeira e segunda categoria da tabela e exiba a quantidade de linhas afetadas.

import java.sql.Connection;


import ATP51.Dao.CategoriaDao;
import ATP51.model.Categoria;
import ATP51.utils.ConnectionFactory;

public class update {
    public static void main(String[] args) {
       

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
