package com.will.ch_19;

import java.io.Serializable;

public class MemberVO implements Serializable {
	
	private int id;
	private String username;
	private String cellphone;
	
	public MemberVO() {
		
	}
	
	public MemberVO(int id, String username, String cellphone) {
		super();
		this.id = id;
		this.username = username;
		this.cellphone = cellphone;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", username=" + username + ", cellphone=" + cellphone + "]";
	}
}
