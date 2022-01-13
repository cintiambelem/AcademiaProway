package com.cintiabelem.ATP52.dao;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;


public class ConnectionFactory {
	private DataSource dataSource;

	public ConnectionFactory() {
		ComboPooledDataSource pool = new ComboPooledDataSource();
		pool.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
		pool.setUser("postgres");
		pool.setPassword("123456");
		pool.setMaxPoolSize(50);
		this.dataSource = pool;
	}

	public Connection getConnection() throws SQLException {
		return this.dataSource.getConnection();
	}

}
