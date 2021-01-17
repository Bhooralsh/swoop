package com.swoop.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="promo_code")
public class PromoCode {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="promo_code_id")
	private int promoCodeId;
	@Column(name="title")
	private String title;
	@Column(name="description")
	private String description;
	@Column(name="code")
	private String code;
	@Column(name="discount")
	private double doscount;
	@Column(name="created")
	private Date created;
	@Column(name="modified")
	private Date modified;
	@Column(name="status")
	private byte status;
	public int getPromoCodeId() {
		return promoCodeId;
	}
	public void setPromoCodeId(int promoCodeId) {
		this.promoCodeId = promoCodeId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getDoscount() {
		return doscount;
	}
	public void setDoscount(double doscount) {
		this.doscount = doscount;
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
	
	



}
