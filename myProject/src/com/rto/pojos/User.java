package com.rto.pojos;

import javax.persistence.*;

@Entity
@Table(name="login")
public class User {

	private Integer id;
	private String password;
	private UserInfo userInfo;
	
	public User() {
		super();
	}

	public User(String password) {
		super();
		this.password = password;
	}

	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	@Override
	public String toString() {
		return "Login [password=" + password + ", id=" + id + "]";
	}

	@OneToOne(mappedBy="user", cascade=CascadeType.ALL)
	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

}
