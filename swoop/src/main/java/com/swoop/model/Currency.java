package com.swoop.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="currency")
public class Currency {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="currency_id")
	private int currencyId;
	@Column(name="name")
	private String name;
	@Column(name="icone_image")
	private String iconeImage;
	@Column(name="created")
	private Date created;
	@Column(name="modified")
	private Date modified;
	@Column(name="status")
	private byte status;
	public int getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIconeImage() {
		return iconeImage;
	}
	public void setIconeImage(String iconeImage) {
		this.iconeImage = iconeImage;
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
