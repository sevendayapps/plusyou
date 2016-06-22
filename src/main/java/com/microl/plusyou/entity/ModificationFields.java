package com.microl.plusyou.entity;

import java.util.Date;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class ModificationFields {
	private Long createdBy;
	private Date createdTime;
	private Long editedBy;
	private Date editedTime;
	
	public ModificationFields() {
		super();
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Long getEditedBy() {
		return editedBy;
	}

	public void setEditedBy(Long editedBy) {
		this.editedBy = editedBy;
	}

	public Date getEditedTime() {
		return editedTime;
	}

	public void setEditedTime(Date editedTime) {
		this.editedTime = editedTime;
	}
}
