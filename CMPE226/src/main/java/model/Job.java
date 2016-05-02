package model;

import java.io.Serializable;
import java.sql.Date;


public class Job implements Serializable{

	private Long JobId;
	private String JobTitle;
	private int Salary;
	private Date StartDate;
	private Long HrManagerId;
	public Long getJobId() {
		return JobId;
	}
	public void setJobId(Long jobId) {
		JobId = jobId;
	}
	public String getJobTitle() {
		return JobTitle;
	}
	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Long getHrManagerId() {
		return HrManagerId;
	}
	public void setHrManagerId(Long hrManagerId) {
		HrManagerId = hrManagerId;
	}
		
}
