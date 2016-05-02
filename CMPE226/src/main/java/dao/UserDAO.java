package dao;


import java.util.List;

import model.User;

public interface UserDAO {
	
	void save(User user);
	void update(User user);
	void delete(User user);
	User findByUserId(int userId);

}
