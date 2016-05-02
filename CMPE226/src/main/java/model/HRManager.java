package model;

import java.io.Serializable;
import java.sql.Date;

public class HRManager implements Serializable{
	
	private Long HrManagerId;
	private String Name;
	private String Organization;
	public Long getHrManagerId() {
		return HrManagerId;
	}
	public void setHrManagerId(Long hrManagerId) {
		HrManagerId = hrManagerId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getOrganization() {
		return Organization;
	}
	public void setOrganization(String organization) {
		Organization = organization;
	}

}
