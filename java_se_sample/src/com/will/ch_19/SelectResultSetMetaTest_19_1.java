package com.will.ch_19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectResultSetMetaTest_19_1 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/store";
		Connection conn = null;
		try {
			Class.forName ("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection (url, "root", "123456");
			Statement s = conn.createStatement();
			String sql = "SELECT id, username, cellphone FROM store.member;";
			ResultSet rs = s.executeQuery(sql);
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			for(int i = 1; i <= columnCount; i++) {
				System.out.println("metaData.getColumnName(" + i + "): " + metaData.getColumnName(i));
				System.out.println("metaData.getColumnLabel(" + i + "): " + metaData.getColumnLabel(i));
				System.out.println("metaData.getColumnType(" + i + "): " + metaData.getColumnType(i));
				System.out.println("metaData.getColumnTypeName(" + i + "): " + metaData.getColumnTypeName(i));
				System.out.println("metaData.getTableName(" + i + "): " + metaData.getTableName(i));
				System.out.println("metaData.isNullable(" + i + "): " + metaData.isNullable(i));
			}
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
