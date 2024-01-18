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
@Table(name = "category")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Category_id")
	private int Category_id;
	
	@Column(name = "title")
	private String title;

	public int getCategory_id() {
		return Category_id;
	}

	public void setCategory_id(int category_id) {
		Category_id = category_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Category(String title) {
		super();
		this.title = title;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
