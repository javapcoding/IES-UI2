package com.usa.ri.gov.ies.dc.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class DcCaseChildDetails{
	
	private Integer childId;

	private Integer caseId;
	
	private String indivName;
	
	private String childName;

	private String childGender;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date childDob;
	
	private Long childSSN;

	public Integer getChildId() {
		return childId;
	}

	public void setChildId(Integer childId) {
		this.childId = childId;
	}

	public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public String getIndivName() {
		return indivName;
	}

	public void setIndivName(String indivName) {
		this.indivName = indivName;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public String getChildGender() {
		return childGender;
	}

	public void setChildGender(String childGender) {
		this.childGender = childGender;
	}

	public Date getChildDob() {
		return childDob;
	}

	public void setChildDob(Date childDob) {
		this.childDob = childDob;
	}

	public Long getChildSSN() {
		return childSSN;
	}

	public void setChildSSN(Long childSSN) {
		this.childSSN = childSSN;
	}

}
