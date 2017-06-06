package com.will.ch_19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatementTest_19_1 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/store";
		Connection conn = null;
		try {
			Class.forName ("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection (url, "root", "123456");
			Statement s = conn.createStatement();
			String sql = "INSERT INTO `store`.`member` (`id`, `username`, `cellphone`) VALUES ('4', 'Tina', '0955555555');";
			int num = s.executeUpdate(sql);
			System.out.println("[" + num + "] row inserted");
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
