package com.test1;

public class TargetScheduleJobMaintenance {
	private Integer TargetJobId;
	private String downTimeApplicable;
	private String downTimeNotificationMode;
	private String fromEmail;
	private String toEmail;
	private String cc;
	private String bcc;
	private Boolean ccAsBcc;
	private String timeZone;
	private String teamContact;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public TargetScheduleJobMaintenance() {

	}

	public TargetScheduleJobMaintenance(Integer targetJobId, String downTimeApplicable, String downTimeNotificationMode,
			String fromEmail, String toEmail, String cc, String bcc, Boolean ccAsBcc, String timeZone,
			String teamContact, String creationDate, String modifiedDate, String entityState) {
		super();
		TargetJobId = targetJobId;
		this.downTimeApplicable = downTimeApplicable;
		this.downTimeNotificationMode = downTimeNotificationMode;
		this.fromEmail = fromEmail;
		this.toEmail = toEmail;
		this.cc = cc;
		this.bcc = bcc;
		this.ccAsBcc = ccAsBcc;
		this.timeZone = timeZone;
		this.teamContact = teamContact;
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

	public String getDownTimeApplicable() {
		return downTimeApplicable;
	}

	public void setDownTimeApplicable(String downTimeApplicable) {
		this.downTimeApplicable = downTimeApplicable;
	}

	public String getDownTimeNotificationMode() {
		return downTimeNotificationMode;
	}

	public void setDownTimeNotificationMode(String downTimeNotificationMode) {
		this.downTimeNotificationMode = downTimeNotificationMode;
	}

	public String getFromEmail() {
		return fromEmail;
	}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	public String getToEmail() {
		return toEmail;
	}

	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getBcc() {
		return bcc;
	}

	public void setBcc(String bcc) {
		this.bcc = bcc;
	}

	public Boolean getCcAsBcc() {
		return ccAsBcc;
	}

	public void setCcAsBcc(Boolean ccAsBcc) {
		this.ccAsBcc = ccAsBcc;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getTeamContact() {
		return teamContact;
	}

	public void setTeamContact(String teamContact) {
		this.teamContact = teamContact;
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
