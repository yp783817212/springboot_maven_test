package com.test.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue
	private long id;

	@NotNull
	private String name;

	@NotNull
	private String code;

	@NotNull
	private Date createDate;

	public User() { }

	public User(long id) {
		super();
		this.id = id;
	}

	public User(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}

	public User(long id, String name, String code, Date createDate) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.createDate = createDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
