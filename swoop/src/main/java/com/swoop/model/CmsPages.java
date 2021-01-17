package com.swoop.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CmsPages {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cms_page")
	private int cmsPage;
	
	@Column(name="name")
	private String name;
	@Column(name="created")
	private Date created;
	@Column(name="modified")
	private Date modified;
	@Column(name="status")
	private byte status;
	@Column(name="language")
	private Language language;
	@Column(name="description")
	private String description;
	@Column(name="title")
	private String title;
	//cms_pageid INT FK 
//language_id INT FK 
	public int getCmsPage() {
		return cmsPage;
	}
	public void setCmsPage(int cmsPage) {
		this.cmsPage = cmsPage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getModified() {
		return modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}
	public byte getStatus() {
		return status;
	}
	public void setStatus(byte status) {
		this.status = status;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	
}
