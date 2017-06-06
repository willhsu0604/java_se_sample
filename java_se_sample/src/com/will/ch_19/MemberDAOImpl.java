package com.will.ch_19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAOImpl implements MemberDAO {
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost/store";
		Class.forName ("com.mysql.jdbc.Driver");
		return DriverManager.getConnection (url, "root", "123456");
	}

	@Override
	public List<MemberVO> listAll() {
		Connection conn = null;
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
			conn = getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("SELECT id, username, cellphone FROM store.member;");
			while(rs.next()) {
				int id = rs.getInt(1);
				String username = rs.getString(2);
				String cellphone = rs.getString(3);
				list.add(new MemberVO(id, username, cellphone));
			};
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}

	@Override
	public MemberVO get(int id) {
		Connection conn = null;
		MemberVO memberVO = null;
		try {
			conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT id, username, cellphone FROM store.member where id = ?;");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				String username = rs.getString(2);
				String cellphone = rs.getString(3);
				memberVO = new MemberVO(id, username, cellphone);
			}
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return memberVO;
	}

	@Override
	public int add(MemberVO memberVO) {
		Connection conn = null;
		int num = 0;
		try {
			conn = getConnection();
			String sql = "INSERT INTO `store`.`member` (`id`, `username`, `cellphone`) VALUES (?, ?, ?);";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, memberVO.getId());
			ps.setString(2, memberVO.getUsername());
			ps.setString(3, memberVO.getCellphone());
			num = ps.executeUpdate();
			System.out.println("[" + num + "] row inserted");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return num;
	}

	@Override
	public int update(MemberVO memberVO) {
		Connection conn = null;
		int num = 0;
		try {
			conn = getConnection();
			String sql = "UPDATE `store`.`member` SET `username` = ?, `cellphone` = ? WHERE `id` = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, memberVO.getUsername());
			ps.setString(2, memberVO.getCellphone());
			ps.setInt(3, memberVO.getId());
			num = ps.executeUpdate();
			System.out.println("[" + num + "] row updated");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return num;
	}

	@Override
	public int delete(int id) {
		Connection conn = null;
		int num = 0;
		try {
			conn = getConnection();
			String sql = "DELETE FROM `store`.`member` WHERE id = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			num = ps.executeUpdate();
			System.out.println("[" + num + "] row deleted");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return num;
	}

}
