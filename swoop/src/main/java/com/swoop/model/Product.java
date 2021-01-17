package com.swoop.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="product_id")
	private int productId;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="category_id",referencedColumnName="category_id")
	private Category category;
	@ManyToOne
	@JoinColumn(name="state_id",referencedColumnName="state_id")
	private States state;
	@ManyToOne
	@JoinColumn(name="city_id",referencedColumnName="city_id")
	private City city;
	@ManyToOne
	@JoinColumn(name="currency_id",referencedColumnName="currency_id")
	private Currency currency;
	private String latitude;
	private String longitude;
	private String availabilityType;
	private Date startDate;
	private Date endDate;
	private double price;
	private String minimuRentTime;
	private Date created;
	private Date modified;
	private byte status;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public States getState() {
		return state;
	}
	public void setState(States state) {
		this.state = state;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getAvailabilityType() {
		return availabilityType;
	}
	public void setAvailabilityType(String availabilityType) {
		this.availabilityType = availabilityType;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMinimuRentTime() {
		return minimuRentTime;
	}
	public void setMinimuRentTime(String minimuRentTime) {
		this.minimuRentTime = minimuRentTime;
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
