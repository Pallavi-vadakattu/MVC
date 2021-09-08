package com.mvi.bean;

import java.util.List;

import javax.persistence.Entity;


public class RatingList {
	private List<Rating> ratings;
	public RatingList() {
	}
	public RatingList(List<Rating> ratings) {
		this.ratings = ratings;
	}
	public List<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	
}
