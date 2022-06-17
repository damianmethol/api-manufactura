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
@Table(name = "security_groups", uniqueConstraints = { @UniqueConstraint(columnNames = { "group_name" }) })
public class SecurityGroup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1486118079045776531L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "group_name")
	private String groupName;

	@Column(name = "group_description")
	private String groupDescription;

	public SecurityGroup() {
		super();
	}

	public SecurityGroup(String groupName, String groupDescription) {
		super();
		this.groupName = groupName;
		this.groupDescription = groupDescription;
	}

	public SecurityGroup(Long id, String groupName, String groupDescription) {
		super();
		this.id = id;
		this.groupName = groupName;
		this.groupDescription = groupDescription;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(groupDescription, groupName, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SecurityGroup other = (SecurityGroup) obj;
		return Objects.equals(groupDescription, other.groupDescription) && Objects.equals(groupName, other.groupName)
				&& Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "SecurityGroup [id=" + id + ", groupName=" + groupName + ", groupDescription=" + groupDescription + "]";
	}

}
