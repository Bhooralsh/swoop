package com.swoop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="email_content_language")
public class EmailContentLanguage {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="email_con_lang")
	private int emailConLang;
	
	
	@ManyToOne
	@JoinColumn(name="language_id",referencedColumnName="language_id")
	private Language language;
	@Column(name="title")
	private String title;
	@Column(name="subject")
	private String subject;
	@Column(name="message")
	private String message;
	public int getEmailConLang() {
		return emailConLang;
	}
	public void setEmailConLang(int emailConLang) {
		this.emailConLang = emailConLang;
	}
	
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

	
}
