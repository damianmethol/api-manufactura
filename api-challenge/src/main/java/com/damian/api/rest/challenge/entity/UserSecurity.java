package com.damian.api.rest.challenge.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_security")
public class UserSecurity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2192997715280656086L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "lvl_id")
	private Long lvlId;

	@Column(name = "group_id")
	private Long groupId;

	private String username;

	private String groupName;

	public UserSecurity() {
		super();
	}

	public UserSecurity(Long userId, Long lvlId, Long groupId, String username, String groupName) {
		super();
		this.userId = userId;
		this.lvlId = lvlId;
		this.groupId = groupId;
		this.username = username;
		this.groupName = groupName;
	}

	public UserSecurity(Long userId, Long lvlId, Long groupId) {
		super();
		this.userId = userId;
		this.lvlId = lvlId;
		this.groupId = groupId;
	}

	public UserSecurity(Long id, Long userId, Long lvlId, Long groupId) {
		super();
		this.id = id;
		this.userId = userId;
		this.lvlId = lvlId;
		this.groupId = groupId;
	}

	public UserSecurity(Long id, Long userId, Long lvlId, Long groupId, String username, String groupName) {
		super();
		this.id = id;
		this.userId = userId;
		this.lvlId = lvlId;
		this.groupId = groupId;
		this.username = username;
		this.groupName = groupName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getLvlId() {
		return lvlId;
	}

	public void setLvlId(Long lvlId) {
		this.lvlId = lvlId;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(groupId, groupName, id, lvlId, userId, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserSecurity other = (UserSecurity) obj;
		return Objects.equals(groupId, other.groupId) && Objects.equals(groupName, other.groupName)
				&& Objects.equals(id, other.id) && Objects.equals(lvlId, other.lvlId)
				&& Objects.equals(userId, other.userId) && Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "UserSecurity [id=" + id + ", userId=" + userId + ", lvlId=" + lvlId + ", groupId=" + groupId
				+ ", username=" + username + ", groupName=" + groupName + "]";
	}

}
