package br.com.caelum.agenda.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	
	public Connection getConnection() {
        try {

			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            return DriverManager.getConnection(
          "jdbc:mysql://sql3.freemysqlhosting.net:3306/sql3162838", "sql3162838", "MK7eEvLQ4s");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
