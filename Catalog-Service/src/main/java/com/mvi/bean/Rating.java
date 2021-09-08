package com.mvi.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Rating {

	@Id
	private int ratingId;
	private String userId;
	private int mviId;
	private int rating;
	public Rating() {
	}
	public Rating(int ratingId, String userId, int mviId, int rating) {
		this.ratingId = ratingId;
		this.userId = userId;
		this.mviId = mviId;
		this.rating = rating;
	}
	public int getRatingId() {
		return ratingId;
	}
	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getMviId() {
		return mviId;
	}
	public void setMviId(int mviId) {
		this.mviId = mviId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
}
