package com.test1;

public class TargetScheduleJob {
	private Integer TargetJobId;
	private String TargetJobName;
	private String TargetJobScript;
	private String TargetJobStartTime;
	private String TargetJobEndTime;
	private String TargetJobOwner;
	private boolean autoRun;
	private String manualRunIndicator;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public TargetScheduleJob() {

	}

	public TargetScheduleJob(Integer targetJobId, String targetJobName, String targetJobScript,
			String targetJobStartTime, String targetJobEndTime, String targetJobOwner, boolean autoRun,
			String manualRunIndicator, String creationDate, String modifiedDate, String entityState) {
		super();
		TargetJobId = targetJobId;
		TargetJobName = targetJobName;
		TargetJobScript = targetJobScript;
		TargetJobStartTime = targetJobStartTime;
		TargetJobEndTime = targetJobEndTime;
		TargetJobOwner = targetJobOwner;
		this.autoRun = autoRun;
		this.manualRunIndicator = manualRunIndicator;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getTargetJobId() {
		return TargetJobId;
	}

	public void setTargetJobId(Integer targetJobId) {
		TargetJobId = targetJobId;
	}

	public String getTargetJobName() {
		return TargetJobName;
	}

	public void setTargetJobName(String targetJobName) {
		TargetJobName = targetJobName;
	}

	public String getTargetJobScript() {
		return TargetJobScript;
	}

	public void setTargetJobScript(String targetJobScript) {
		TargetJobScript = targetJobScript;
	}

	public String getTargetJobStartTime() {
		return TargetJobStartTime;
	}

	public void setTargetJobStartTime(String targetJobStartTime) {
		TargetJobStartTime = targetJobStartTime;
	}

	public String getTargetJobEndTime() {
		return TargetJobEndTime;
	}

	public void setTargetJobEndTime(String targetJobEndTime) {
		TargetJobEndTime = targetJobEndTime;
	}

	public String getTargetJobOwner() {
		return TargetJobOwner;
	}

	public void setTargetJobOwner(String targetJobOwner) {
		TargetJobOwner = targetJobOwner;
	}

	public boolean isAutoRun() {
		return autoRun;
	}

	public void setAutoRun(boolean autoRun) {
		this.autoRun = autoRun;
	}

	public String getManualRunIndicator() {
		return manualRunIndicator;
	}

	public void setManualRunIndicator(String manualRunIndicator) {
		this.manualRunIndicator = manualRunIndicator;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
