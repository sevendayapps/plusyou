package com.microl.plusyou.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.microl.plusyou.hbm.type.converter.CharacterGenderConverter;
import com.microl.plusyou.hbm.type.enumerate.CharacterGender;

@Entity
public class UserProfile extends ModificationFields {
	@Id
	private Long userId;
	
	@Basic
	private String fullName;
	
	@Basic
	@Convert(converter = CharacterGenderConverter.class)
	private CharacterGender gender;
	
	@Basic
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.LAZY)
	private List<WorkingRecord> workingRecords;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.LAZY)
	private List<Qualification> qualifications;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.LAZY)
	private List<Article> articles;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.LAZY)
	private List<Individual> individuals;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.LAZY)
	private List<Company> companies;

	public UserProfile() {
		super();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public CharacterGender getGender() {
		return gender;
	}

	public void setGender(CharacterGender gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public List<WorkingRecord> getWorkingRecords() {
		return workingRecords;
	}

	public void setWorkingRecords(List<WorkingRecord> workingRecords) {
		this.workingRecords = workingRecords;
	}

	public List<Qualification> getQualifications() {
		return qualifications;
	}

	public void setQualifications(List<Qualification> qualifications) {
		this.qualifications = qualifications;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public List<Individual> getIndividuals() {
		return individuals;
	}

	public void setIndividuals(List<Individual> individuals) {
		this.individuals = individuals;
	}

	public List<Company> getCompanies() {
		return companies;
	}

	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}
}
