package bo;

import dao.UserDAO;
import model.User;

public class UserBoIml implements UserBo {
	
	UserDAO userDao;
	
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}


	@Override
	public void save(User user) {
		userDao.save(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public User findByUserId(int userId) {
		// TODO Auto-generated method stub
		return userDao.findByUserId(userId);
	}

}
