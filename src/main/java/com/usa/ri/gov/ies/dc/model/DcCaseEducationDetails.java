package com.usa.ri.gov.ies.dc.model;

import lombok.Data;

@Data
public class DcCaseEducationDetails {
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

	public String getHighestQlfy() {
		return highestQlfy;
	}

	public void setHighestQlfy(String highestQlfy) {
		this.highestQlfy = highestQlfy;
	}

	public Integer getCompletedYear() {
		return completedYear;
	}

	public void setCompletedYear(Integer completedYear) {
		this.completedYear = completedYear;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	private Integer caseId;
	
	private String indivName;

	private String highestQlfy;

	private Integer completedYear;

	private String grade;
}
