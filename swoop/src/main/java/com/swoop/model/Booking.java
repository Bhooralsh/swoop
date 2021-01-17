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
@Table(name="booking")
public class Booking {
	

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="booking_id")
private int bookingId;

@ManyToOne
@JoinColumn(name="product_id",referencedColumnName="product_id")
private Product product;

//user id INT FK
/*
 * @ManyToOne(cascade=CascadeType.ALL)
 * 
 * @JoinColumn(name="user_id",referencedColumnName="user_id") private User user;
 */
private Date rentinDate;

private Date rentOutDate;
private double pricePerDay;
private double totalPrice;
private double taxPaid;
private double siteFees;
private double amountPaid;
private boolean isRefund;
private Date cancelDate;
private double refundPaid;
//private int transactionId;//fk
private double effectiveAmount;
private Date bookingDate;
private Date createdDate;
private Date modified;
private byte status;
public int getBookingId() {
	return bookingId;
}
public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public Date getRentinDate() {
	return rentinDate;
}
public void setRentinDate(Date rentinDate) {
	this.rentinDate = rentinDate;
}
public Date getRentOutDate() {
	return rentOutDate;
}
public void setRentOutDate(Date rentOutDate) {
	this.rentOutDate = rentOutDate;
}
public double getPricePerDay() {
	return pricePerDay;
}
public void setPricePerDay(double pricePerDay) {
	this.pricePerDay = pricePerDay;
}
public double getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}
public double getTaxPaid() {
	return taxPaid;
}
public void setTaxPaid(double taxPaid) {
	this.taxPaid = taxPaid;
}
public double getSiteFees() {
	return siteFees;
}
public void setSiteFees(double siteFees) {
	this.siteFees = siteFees;
}
public double getAmountPaid() {
	return amountPaid;
}
public void setAmountPaid(double amountPaid) {
	this.amountPaid = amountPaid;
}
public boolean isRefund() {
	return isRefund;
}
public void setRefund(boolean isRefund) {
	this.isRefund = isRefund;
}
public Date getCancelDate() {
	return cancelDate;
}
public void setCancelDate(Date cancelDate) {
	this.cancelDate = cancelDate;
}
public double getRefundPaid() {
	return refundPaid;
}
public void setRefundPaid(double refundPaid) {
	this.refundPaid = refundPaid;
}
public double getEffectiveAmount() {
	return effectiveAmount;
}
public void setEffectiveAmount(double effectiveAmount) {
	this.effectiveAmount = effectiveAmount;
}
public Date getBookingDate() {
	return bookingDate;
}
public void setBookingDate(Date bookingDate) {
	this.bookingDate = bookingDate;
}
public Date getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
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
/*
 * public User getUser() { return user; } public void setUser(User user) {
 * this.user = user; }
 */



}
