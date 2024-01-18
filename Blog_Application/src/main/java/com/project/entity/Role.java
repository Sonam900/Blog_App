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
@Table (name ="role")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column( name = "role_id")
	private int role_id;
	
	@Column (name="role_name")
	private int role_name;

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public int getRole_name() {
		return role_name;
	}

	public void setRole_name(int role_name) {
		this.role_name = role_name;
	}

	public Role(int role_id, int role_name) {
		super();
		this.role_id = role_id;
		this.role_name = role_name;
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
