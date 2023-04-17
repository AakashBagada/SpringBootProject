package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.userBean;

@Repository
public class userDao {

	@Autowired
	JdbcTemplate stmt;
	
	public void addUser(userBean uBean) {
		String insertUSer="insert into Users(firstName,lastName,email,password) values(?,?,?,?)";
		
		stmt.update(insertUSer ,uBean.getFirstName(),uBean.getLastName(),uBean.getEmail(),uBean.getPassword());
	}
}
