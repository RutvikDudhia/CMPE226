package helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bo.UserBo;
import model.User;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"springconfig.xml");
		UserBo userBo = (UserBo) context.getBean("userBo");
		User user = userBo.findByUserId((long) 1);
		System.out.println(user.getPassword());

	
	}
}

