package bo;

import model.User;

public interface UserBo {
	
	void save(User user);
	void update(User user);
	void delete(User user);
	User findByUserId(int userId);

}
