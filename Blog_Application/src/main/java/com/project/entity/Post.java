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
@Table (name ="post")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column (name ="post_id")
	private int post_id;

@Column ( name = "title")
	private String title;

@Column ( name ="content")
	private String content;

@Column (name = "user_id")
	User user_id;

@Column (name ="category_id")
	Category category_id;

@Column (name ="image")
private String image;

public int getPost_id() {
	return post_id;
}

public void setPost_id(int post_id) {
	this.post_id = post_id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}

public User getUser_id() {
	return user_id;
}

public void setUser_id(User user_id) {
	this.user_id = user_id;
}

public Category getCategory_id() {
	return category_id;
}

public void setCategory_id(Category category_id) {
	this.category_id = category_id;
}

public String getImage() {
	return image;
}

public void setImage(String image) {
	this.image = image;
}

public Post(String title, String content, User user_id, Category category_id, String image) {
	super();
	this.title = title;
	this.content = content;
	this.user_id = user_id;
	this.category_id = category_id;
	this.image = image;
}

public Post() {
	super();
	// TODO Auto-generated constructor stub
}



}


