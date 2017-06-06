package com.will.ch_19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest_19_1 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/store";
		Connection conn = null;
		try {
			Class.forName ("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection (url, "root", "123456");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
