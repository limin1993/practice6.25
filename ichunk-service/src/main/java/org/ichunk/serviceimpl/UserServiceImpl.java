package org.ichunk.serviceimpl;

import javax.annotation.Resource;

import org.ichunk.model.User;
import org.ichunk.persist.UserPersist;
import org.ichunk.service.UserService;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserPersist userPersist;

	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	public boolean login(String name, String password) {

		User user = userPersist.getUserByName(name);
		
		if (user == null)
			return false;
		
		if (user.getPassword().equals(password))
			return true;
		else
			return false;
	}
	
	

}
