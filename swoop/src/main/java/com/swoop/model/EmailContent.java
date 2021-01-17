package com.swoop.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="email_content")
public class EmailContent {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="email_content_id")
	private int emailContentId;
	@Column(name="unique_name")
	private String uniqueName;
	@Column(name="kewcrs")
	private String kewcrs;
	@Column(name="created")
	private Date created;
	@Column(name="modified")
	private Date modified;
	@Column(name="status")
	private byte status;
	public int getEmailContentId() {
		return emailContentId;
	}
	public void setEmailContentId(int emailContentId) {
		this.emailContentId = emailContentId;
	}
	public String getUniqueName() {
		return uniqueName;
	}
	public void setUniqueName(String uniqueName) {
		this.uniqueName = uniqueName;
	}
	public String getKewcrs() {
		return kewcrs;
	}
	public void setKewcrs(String kewcrs) {
		this.kewcrs = kewcrs;
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
