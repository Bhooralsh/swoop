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
@Table(name="product_reviews")
public class ProductReviews {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="product_review_id")
	private int productReviewsId;
	
	@ManyToOne
	@JoinColumn(name="product_id",referencedColumnName="product_id")
	private Product product;
	
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="user_id",referencedColumnName="user_id") private User user;
	 */
	@ManyToOne
	@JoinColumn(name="booking_id",referencedColumnName="booking_id")
	private Booking booking;
	//booking_id INT FK
	@Column(name="comment")
	private String comment;
	@Column(name="rating")
	private String rating;
	@Column(name="created")
	private Date created;
	@Column(name="modified")
	private Date modified;
	@Column(name="status")
	private byte status;
	public int getProductReviewsId() {
		return productReviewsId;
	}
	public void setProductReviewsId(int productReviewsId) {
		this.productReviewsId = productReviewsId;
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
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
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
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	
}
