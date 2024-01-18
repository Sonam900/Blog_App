package com.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name ="user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name = "id")
	private int id;

@Column(name = "name")
	private String name;

@Column(name = "email")
	private String email;

@Column(name = "password")
	private String password;

@Column(name = "about")
	private String about;


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getAbout() {
	return about;
}

public void setAbout(String about) {
	this.about = about;
}

public User(String name, String email, String password, String about) {
	super();
	this.name = name;
	this.email = email;
	this.password = password;
	this.about = about;
}

public User() {
	super();
	// TODO Auto-generated constructor stub
}
	

}
