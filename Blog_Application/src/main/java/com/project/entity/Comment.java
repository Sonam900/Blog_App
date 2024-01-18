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
@Table(name = "comment")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Comment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "comment_id")
	private int comment_id;

	@Column(name = "comment")
	private String comment;

	@Column(name = "user_id")
	User user_id;

	@Column(name = "post_id")
	Post post_id;

	public int getComment_id() {
		return comment_id;
	}

	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}

	public Post getPost_id() {
		return post_id;
	}

	public void setPost_id(Post post_id) {
		this.post_id = post_id;
	}

	public Comment(String comment, User user_id, Post post_id) {
		super();
		this.comment = comment;
		this.user_id = user_id;
		this.post_id = post_id;
	}

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
