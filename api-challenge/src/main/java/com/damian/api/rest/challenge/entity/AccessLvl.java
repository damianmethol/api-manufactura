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
@Table(name = "access_lvl", uniqueConstraints = { @UniqueConstraint(columnNames = { "lvl" }) })
public class AccessLvl implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2757057571157025517L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String lvl;

	public AccessLvl() {
		super();
	}

	public AccessLvl(String lvl) {
		super();
		this.lvl = lvl;
	}

	public AccessLvl(Long id, String lvl) {
		super();
		this.id = id;
		this.lvl = lvl;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLvl() {
		return lvl;
	}

	public void setLvl(String lvl) {
		this.lvl = lvl;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, lvl);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccessLvl other = (AccessLvl) obj;
		return Objects.equals(id, other.id) && Objects.equals(lvl, other.lvl);
	}

	@Override
	public String toString() {
		return "AccessLvl [id=" + id + ", lvl=" + lvl + "]";
	}

}
