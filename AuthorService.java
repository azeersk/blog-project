package com.example.springBlogs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springBlogs.model.Author;


@Service
public interface AuthorService {

	public Author saveAuthorName(Author author);
	
	public List<Author> getAllUsers();
	
	public Author getPost(String Id);
	
	public String DeletePost(String Id);
	
	public Author updatedPost(Author author);
}
