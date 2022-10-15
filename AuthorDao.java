package com.example.springBlogs.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.springBlogs.model.Author;

@Repository
public interface AuthorDao extends CrudRepository<Author, String> {

}
