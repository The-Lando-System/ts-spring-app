package com.mattvoget.tsspring.repositories;

import com.mattvoget.tsspring.models.User;

public interface UserRepositoryCustom {

	User createAccount(User newAccount);
	
}
