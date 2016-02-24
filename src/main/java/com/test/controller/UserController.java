package com.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.dao.UserDao;
import com.test.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {

    protected final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
	private UserDao userDao;

	@RequestMapping(value = "/{id}")
	@ResponseBody
	public String getById(@PathVariable long id) {
		String userId;
		try {
			User user = userDao.findById(id);
			userId = String.valueOf(user.getId());
		} catch (Exception ex) {
			return "Users not found: " + ex.toString();
		}
		return "The Users id is: " + userId ;
	}

}
