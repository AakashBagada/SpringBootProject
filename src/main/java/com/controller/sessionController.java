package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.userBean;
import com.dao.userDao;

@RestController
public class sessionController {
	
	@Autowired
	userDao userD;
	
     @RequestMapping(method = RequestMethod.POST ,value = "/signup")
	public userBean signup(@RequestBody userBean uBean) {	
    	 userD.addUser(uBean);
	    return uBean;
	}
}
