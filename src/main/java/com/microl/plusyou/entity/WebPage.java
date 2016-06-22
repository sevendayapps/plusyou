package com.microl.plusyou.entity;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class WebPage {
	private Long id;
	private String title;
	private List<String> meta;
	
	public WebPage() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getMeta() {
		return meta;
	}

	public void setMeta(List<String> meta) {
		this.meta = meta;
	}
}
