package com.swoop.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="product_image")
public class ProductImage {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productImageId;
	
	//property_id INT FK
	//added_by_user INT FK
	@ManyToOne
	@JoinColumn(name="product_id",referencedColumnName="product_id")
	private Product product;
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="user_id",referencedColumnName="user_id") private User user;
	 */
	@Column(name="image")
	private String image;
	@Column(name="date_time")
	private Date dateTime;
	@Column(name="status")
	private byte status;
	public int getProductImageId() {
		return productImageId;
	}
	public void setProductImageId(int productImageId) {
		this.productImageId = productImageId;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public byte getStatus() {
		return status;
	}
	public void setStatus(byte status) {
		this.status = status;
	}
	
	
	
	


}
