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
		//userDao.ud
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findByUserId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
