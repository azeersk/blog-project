package com.example.springBlogs.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {
	@Id
	private String post;
	private String authorName;
	private String tag;
	private String comment;
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Author() {
		// TODO Auto-generated constructor stub
	}
	public Author(String post, String authorName, String tag, String comment) {
		super();
		this.post = post;
		this.authorName = authorName;
		this.tag = tag;
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Author [post=" + post + ", authorName=" + authorName + ", tag=" + tag + ", comment=" + comment + "]";
	}
	
	

	
}
