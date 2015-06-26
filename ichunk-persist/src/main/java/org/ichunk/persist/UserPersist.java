package org.ichunk.persist;

import org.ichunk.model.User;

public interface UserPersist {
	
	public void add(User user);
	public User getUserByName(String name);

}
