package dao;

import java.util.List;

import org.hibernate.SessionFactory;

import model.User;

public class UserImpl implements UserDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> getUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
