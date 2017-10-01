package gagan.sqlj.practice.helloworld;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTemplate {

	private Connection connection = null;

	public JDBCTemplate() {

		String userid = "system";
		String passwd = "gagan";
		String url = "jdbc:oracle:thin:@//localhost:1521/XE";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("Error loading Oracle Driver");
			e.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(url, userid, passwd);
		} catch (SQLException e) {
			System.out.println("Error while making connection to Oracle");
			e.printStackTrace();
		}

		// connection.setAutoCommit(false);

	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

}
