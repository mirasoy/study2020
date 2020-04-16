package Model;

import java.sql.*;

public class Connect {
	public static Connection getConnection(String driver, String url, String user, String password) {
		Connection con;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공");
			return con;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("연결실패");
			return null;
		}

	}

	public static Connection getConnection() {
		try {
			Class.forName("org.h2.Driver");

			String url = "", user = "", password = "";
			url = "jdbc:h2:tcp://localhost/~/test";
			user = "sa";
			password = "";

			return DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("-1");
			return null;
		}

	}

}
