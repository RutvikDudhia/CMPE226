package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.SessionFactory;



@Entity
@Table(name="User")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long UserId;
	private String Password;
	private int type;

	public Long getUserId() {
		return UserId;
	}
	public void setUserId(Long userId) {
		UserId = userId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}

	
	

    
}
