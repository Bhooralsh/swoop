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
@Table(name="transactions")
public class Transaactions {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int transaction_id;

	@ManyToOne
	@JoinColumn(name="product_id",referencedColumnName="product_id")
	Product product;

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="user_id",referencedColumnName="user_id") private User user;
	 */
	 
	
	//payee_id INT FK
	@ManyToOne
	@JoinColumn(name="booking_id",referencedColumnName="booking_id")
	private Booking booking;
	@ManyToOne
	@JoinColumn(name="currency_id",referencedColumnName="currency_id")
	private Currency currency;
	@Column(name="site_fees")
	private double siteFees;
	@Column(name="amount")
	private double amount;
	@Column(name="transfer_on")
	private Date transferOn ;
	 
	//promo_code_id INT FK
	@Column(name="dicount_amount")
	private double discountAmount;
	@Column(name="created")
	private Date created;
	@Column(name="modified")
	private Date modified;
	@Column(name="status")
	private byte status;
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	/*
	 * public User getUser() { return user; } public void setUser(User user) {
	 * this.user = user; }
	 */
	
	
	
	
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public double getSiteFees() {
		return siteFees;
	}
	public void setSiteFees(double siteFees) {
		this.siteFees = siteFees;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getTransferOn() {
		return transferOn;
	}
	public void setTransferOn(Date transferOn) {
		this.transferOn = transferOn;
	}
	public double getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
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
