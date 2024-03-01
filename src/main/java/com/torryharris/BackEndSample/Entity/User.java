package com.torryharris.BackEndSample.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "userid")
    private Integer userid;

	
	@Column(name = "emailid")
    private String emailid;
	@Column(name = "password")
    private String password;
	@Column(name = "username")
    private String username;
	@Column(name = "usertype")
	private String usertype;
	public User(Integer userid, String emailid, String password, String username, String usertype) {
		super();
		this.userid = userid;
		this.emailid = emailid;
		this.password = password;
		this.username = username;
		this.usertype = usertype;
	}
	public User() {
		super();
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", emailid=" + emailid + ", password=" + password + ", username=" + username
				+ ", usertype=" + usertype + "]";
	}
	
	
}

