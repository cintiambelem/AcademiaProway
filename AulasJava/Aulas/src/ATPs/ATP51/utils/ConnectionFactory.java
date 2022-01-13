package ATP51.utils;

//__  Crie uma cópia das classes criadas durante a atividade ATP48.
//_  Crie uma classe ConnectionFactory para abrigar sua fábrica de conexões. Esta classe deve ter um método que retorne uma Conexão com o Postgres.
//_  Altere as 4 classes para utilizarem a fábrica de conexões e tambem o try with resource para que a conexão seja fechada automaticamente.

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
    private DataSource dataSource;

    public ConnectionFactory(){
        ComboPooledDataSource pool = new ComboPooledDataSource();
        pool.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
        pool.setUser("postgres");
        pool.setPassword("123456");
        pool.setMaxPoolSize(50);
        this.dataSource = pool;
    }


    public Connection getConnection() throws SQLException{
        return this.dataSource.getConnection();
    }
    
}
