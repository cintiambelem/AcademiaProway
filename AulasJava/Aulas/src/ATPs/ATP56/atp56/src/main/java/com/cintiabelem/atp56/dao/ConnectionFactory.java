package com.cintiabelem.atp56.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

public class ConnectionFactory {
	private DataSource dataSource;

	public ConnectionFactory() {
		ComboPooledDataSource pool = new ComboPooledDataSource();
		this.dataSource = pool;
	}

	public Connection getConnection() throws SQLException {
		return this.dataSource.getConnection();
	}

}