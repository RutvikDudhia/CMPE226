package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import model.User;

public class UserImpl extends HibernateDaoSupport implements UserDAO {

	private SessionFactory sessionFactory;


	@Override
	public void save(User user) {
		getHibernateTemplate().save(user);

	}


	@Override
	public void update(User user) {
		getHibernateTemplate().update(user);		
	}

	@Override
	public void delete(User user) {
		getHibernateTemplate().delete(user);
		
	}

	@Override
	public User findByUserId(int userId) {
		List list = getHibernateTemplate().find(
                "from Stock where stockCode=?",userId
          );
		return (User)list.get(0);
	}

}
