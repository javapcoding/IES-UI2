package com.usa.ri.gov.ies.co.batches.model;

import lombok.Data;

@Data()
public class CoBatchSummaryModel {
	public Integer getSummaryId() {
		return summaryId;
	}
	public void setSummaryId(Integer summaryId) {
		this.summaryId = summaryId;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public Long getTotalTriggerProcessed() {
		return totalTriggerProcessed;
	}
	public void setTotalTriggerProcessed(Long totalTriggerProcessed) {
		this.totalTriggerProcessed = totalTriggerProcessed;
	}
	public Long getFailureTriggerCount() {
		return failureTriggerCount;
	}
	public void setFailureTriggerCount(Long failureTriggerCount) {
		this.failureTriggerCount = failureTriggerCount;
	}
	public Long getSuccessTriggerCount() {
		return successTriggerCount;
	}
	public void setSuccessTriggerCount(Long successTriggerCount) {
		this.successTriggerCount = successTriggerCount;
	}
	private Integer summaryId;
	private String batchName;
	private Long totalTriggerProcessed;
	private Long failureTriggerCount;
	private Long successTriggerCount;

}// BatchSummaryModel
