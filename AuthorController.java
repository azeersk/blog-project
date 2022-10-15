package com.example.springBlogs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springBlogs.model.Author;
import com.example.springBlogs.service.AuthorService;

@RestController
@RequestMapping("author")
public class AuthorController {
	
	@Autowired
	AuthorService authorService;
	
	@PostMapping
	public ResponseEntity<Author> saveMyPost(@RequestBody Author author){
		Author authorList = authorService.saveAuthorName(author);
		
		return new ResponseEntity<Author>(authorList, HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Author>> getUsers(){
		
		List<Author> authors = authorService.getAllUsers();
		
		return new ResponseEntity<List<Author>>(authors, HttpStatus.FOUND);
	}
	
	@GetMapping("{postId}")
	public ResponseEntity<Author> getUser(@PathVariable String postId){
		
		Author author= authorService.getPost(postId);
		
		return new ResponseEntity<Author>(author, HttpStatus.FOUND);
		
	}
	
	@DeleteMapping("{postId}")
	public ResponseEntity<String> deleteUser(@PathVariable String postId){
		
		String result = authorService.DeletePost(postId);
		return new ResponseEntity<String>(result, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Author> UpdateUser(@RequestBody Author author){
		Author authorUpd = authorService.updatedPost(author);
		
		return new ResponseEntity<Author>(authorUpd, HttpStatus.CREATED);
		
	}
	
	@GetMapping("{name}")
	public ResponseEntity<Object> getUserByName(@PathVariable String name){
		List<Author> authorByName = authorService.getAllUsers();
		if(authorByName.size()!=0) {
			return new ResponseEntity<Object>(authorByName, HttpStatus.FOUND);
		}
		else {
			return new ResponseEntity<Object>("Data not found", HttpStatus.NOT_FOUND);
		}
	}

}
