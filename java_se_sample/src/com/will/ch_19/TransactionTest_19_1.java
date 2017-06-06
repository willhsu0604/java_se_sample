package com.will.ch_19;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionTest_19_1 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/store";
		Connection conn = null;
		try {
			Class.forName ("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection (url, "root", "123456");
			conn.setAutoCommit(false);
			String sql = "INSERT INTO `store`.`member` (`id`, `username`, `cellphone`) VALUES (?, ?, ?);";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 6);
			ps.setString(2, "Peter");
			ps.setString(3, "0922222222");
			int num = ps.executeUpdate();
			System.out.println("[" + num + "] row inserted to [store].[member]");
			
			sql = "INSERT INTO `store`.`order_record` (`id`, `tx_date`, `price`, `member_id`) VALUES (?, ?, ?, ?, ?);";
			ps = conn.prepareStatement(sql);
			Date date = Date.valueOf("2017-06-06");
			ps.setInt(1, 6);
			ps.setDate(2, date);
			ps.setDouble(3, 400.0);
			ps.setInt(4, 6);
			num = ps.executeUpdate();
			System.out.println("[" + num + "] row inserted to [store].[order_record]");
			conn.commit();
			System.out.println("Transaction is committed");
		} catch (ClassNotFoundException | SQLException e) {
			if(conn != null) {
				try {
					conn.rollback();
					System.out.println("Transaction is rollbacked");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
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
