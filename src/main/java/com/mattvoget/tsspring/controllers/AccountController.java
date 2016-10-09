package com.mattvoget.tsspring.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mattvoget.tsspring.models.User;
import com.mattvoget.tsspring.repositories.UserRepository;
import com.mattvoget.tsspring.utils.UserActivityLogger;

@Controller
@RequestMapping(value="account")
public class AccountController extends ErrorHandlingController {
	
	private Logger log = LoggerFactory.getLogger(AccountController.class);
	
	@Autowired
	private UserActivityLogger userLogger;
	
	@Autowired
	private UserRepository userRepo;

	@RequestMapping(value="/", method=RequestMethod.POST)
	@ResponseBody
	public void createAccount(@RequestBody User newAccount) {
		userRepo.createAccount(newAccount);
	}
	
}
