package com.usa.ri.gov.ies.dc.model;

import lombok.Data;

@Data
public class DcCaseIncomeDetails {

	private Integer caseId;
	
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

	public String getIsEmployee() {
		return isEmployee;
	}

	public void setIsEmployee(String isEmployee) {
		this.isEmployee = isEmployee;
	}

	public Float getWeeklyIncome() {
		return weeklyIncome;
	}

	public void setWeeklyIncome(Float weeklyIncome) {
		this.weeklyIncome = weeklyIncome;
	}

	public Float getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(Float otherIncome) {
		this.otherIncome = otherIncome;
	}

	private String indivName;
	
	private String isEmployee;
	
	private Float weeklyIncome;
	
	private Float otherIncome;
}
