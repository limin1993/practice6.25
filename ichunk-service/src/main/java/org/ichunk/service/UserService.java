package org.ichunk.service;

import org.ichunk.model.User;

public interface UserService {
	
	public void add(User user);
	public boolean login(String name,String password);

}
