package com.will.ch_18;

import java.io.Serializable;

public class Member implements Serializable {
	
	@Description("使用者名稱")
	private String username;
	@Description("使用者密碼")
	private String password;
	@Description("生日")
	private String birthday;
	@Description("全名")
	private String fullName;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
