package com.will.ch_19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPreparementStatementTest_19_1 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/store";
		Connection conn = null;
		try {
			Class.forName ("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection (url, "root", "123456");
			String sql = "INSERT INTO `store`.`member` (`id`, `username`, `cellphone`) VALUES (?, ?, ?);";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 5);
			ps.setString(2, "Tony");
			ps.setString(3, "0911111234");
			int num = ps.executeUpdate();
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
