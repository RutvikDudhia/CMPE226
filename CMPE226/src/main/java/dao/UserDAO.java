package dao;


import java.util.List;

import model.User;

public interface UserDAO {
	
	 public void save(User u);
	 
	 public List<User> getUser(String userId);

}
