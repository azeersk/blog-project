package com.example.springBlogs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springBlogs.dao.AuthorDao;
import com.example.springBlogs.model.Author;

@Service
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	AuthorDao authorDao;

	@Override
	public Author saveAuthorName(Author author) {
		// TODO Auto-generated method stub
		return authorDao.save(author);
	}

	@Override
	public List<Author> getAllUsers() {
		// TODO Auto-generated method stub
		return (List<Author>) authorDao.findAll();
	}

	@Override
	public Author getPost(String Id) {
		// TODO Auto-generated method stub
		Optional<Author> optUser = authorDao.findById(Id);
		if (optUser.isPresent())
			return optUser.get();
		return null;
	}

	@Override
	public String DeletePost(String Id) {
		Author user = getPost(Id);

		if (user != null) {
			authorDao.delete(user);
			return "user Deleted";
		} else
			return "User can not be Deleted!";
	}

	@Override
	public Author updatedPost(Author author) {
		// TODO Auto-generated method stub
		return authorDao.save(author);
	}

}
