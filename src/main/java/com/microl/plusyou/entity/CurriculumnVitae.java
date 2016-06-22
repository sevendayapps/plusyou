package com.microl.plusyou.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class CurriculumnVitae {
	@Id
	private Long id;
	
	@Basic
	private String path;
	
	@Basic
	@Type(type="yes_no")
	private Boolean isMain;
}
