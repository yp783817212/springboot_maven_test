package com.test.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, Long>{
	
	public User findById(long id);
	
	public User findByName(String name);
	
}
