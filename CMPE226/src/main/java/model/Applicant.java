package model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Applicant")
public class Applicant implements Serializable{
	
	private Long ApplicantId;
	private String ApplicantName;
	private String ApplicantGender;
	private String ApplicantCountry;
	private String ApplicantEmail;
	public Long getApplicantId() {
		return ApplicantId;
	}
	public void setApplicantId(Long applicantId) {
		ApplicantId = applicantId;
	}
	public String getApplicantName() {
		return ApplicantName;
	}
	public void setApplicantName(String applicantName) {
		ApplicantName = applicantName;
	}
	public String getApplicantGender() {
		return ApplicantGender;
	}
	public void setApplicantGender(String applicantGender) {
		ApplicantGender = applicantGender;
	}
	public String getApplicantCountry() {
		return ApplicantCountry;
	}
	public void setApplicantCountry(String applicantCountry) {
		ApplicantCountry = applicantCountry;
	}
	public String getApplicantEmail() {
		return ApplicantEmail;
	}
	public void setApplicantEmail(String applicantEmail) {
		ApplicantEmail = applicantEmail;
	}


}
