package com.damian.api.rest.challenge.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "users", uniqueConstraints = { @UniqueConstraint(columnNames = { "username" }) })
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6056890300153532241L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String username;

	@Column
	private String pass;

	@Column(name = "create_at")
	private String createAt;

	@Column(name = "user_status")
	private Boolean userStatus;

	public User() {
		super();
	}

	public User(String username, String pass, String create_at, Boolean userStatus) {
		super();
		this.username = username;
		this.pass = pass;
		this.createAt = create_at;
		this.userStatus = userStatus;
	}

	public User(Long id, String username, String pass, String create_at, Boolean userStatus) {
		super();
		this.id = id;
		this.username = username;
		this.pass = pass;
		this.createAt = create_at;
		this.userStatus = userStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String create_at) {
		this.createAt = create_at;
	}

	public Boolean getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Boolean userStatus) {
		this.userStatus = userStatus;
	}

	@Override
	public int hashCode() {
		return Objects.hash(createAt, id, pass, userStatus, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(createAt, other.createAt) && Objects.equals(id, other.id)
				&& Objects.equals(pass, other.pass) && Objects.equals(userStatus, other.userStatus)
				&& Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", pass=" + pass + ", create_at=" + createAt
				+ ", userStatus=" + userStatus + "]";
	}

}
