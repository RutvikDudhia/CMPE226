package model;

import java.io.Serializable;

public class Organization implements Serializable {
	
	private Long OrganizationId;
	private String OrganizationName;
	public Long getOrganizationId() {
		return OrganizationId;
	}
	public void setOrganizationId(Long organizationId) {
		OrganizationId = organizationId;
	}
	public String getOrganizationName() {
		return OrganizationName;
	}
	public void setOrganizationName(String organizationName) {
		OrganizationName = organizationName;
	}

}
