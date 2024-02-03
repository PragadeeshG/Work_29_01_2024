package com.test1;

public class TargetRelease {
	private Integer targetReleaseIndicator;
	private String projectName;
	private String projectType;
	private String projectOwner;
	private String techContact;
	private String projectPO;
	private Long deploymentIndicator;
	private String projectBA;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public TargetRelease() {

	}

	public TargetRelease(Integer targetReleaseIndicator, String projectName, String projectType, String projectOwner,
			String techContact, String projectPO, Long deploymentIndicator, String projectBA, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.targetReleaseIndicator = targetReleaseIndicator;
		this.projectName = projectName;
		this.projectType = projectType;
		this.projectOwner = projectOwner;
		this.techContact = techContact;
		this.projectPO = projectPO;
		this.deploymentIndicator = deploymentIndicator;
		this.projectBA = projectBA;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getTargetReleaseIndicator() {
		return targetReleaseIndicator;
	}

	public void setTargetReleaseIndicator(Integer targetReleaseIndicator) {
		this.targetReleaseIndicator = targetReleaseIndicator;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public String getProjectOwner() {
		return projectOwner;
	}

	public void setProjectOwner(String projectOwner) {
		this.projectOwner = projectOwner;
	}

	public String getTechContact() {
		return techContact;
	}

	public void setTechContact(String techContact) {
		this.techContact = techContact;
	}

	public String getProjectPO() {
		return projectPO;
	}

	public void setProjectPO(String projectPO) {
		this.projectPO = projectPO;
	}

	public Long getDeploymentIndicator() {
		return deploymentIndicator;
	}

	public void setDeploymentIndicator(Long deploymentIndicator) {
		this.deploymentIndicator = deploymentIndicator;
	}

	public String getProjectBA() {
		return projectBA;
	}

	public void setProjectBA(String projectBA) {
		this.projectBA = projectBA;
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
