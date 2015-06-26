package org.ichunk.persistimpl;

import org.ichunk.model.User;
import org.ichunk.persist.UserPersist;
import org.springframework.stereotype.Repository;

@Repository("UserPersist")
public class UsePersistImpl extends BasePersistImpl<User> implements UserPersist{

	public void add(User user) {
		save(user);
		
	}

	public User getUserByName(String name) {
		
		return (User) get(" from User u where name = ?", new Object[] { name });
	}
	
	

}
