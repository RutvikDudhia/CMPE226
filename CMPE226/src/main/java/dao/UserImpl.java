package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import model.User;

public class UserImpl extends HibernateDaoSupport implements UserDAO {

	private SessionFactory sessionFactory;


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
