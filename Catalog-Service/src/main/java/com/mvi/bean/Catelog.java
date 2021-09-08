package com.mvi.bean;


public class Catelog {
	private String UserID;
	private String mviName;
	private int Rating;
	
	public Catelog() {
	}

	public Catelog(String userID, String mviName, int rating) {
		UserID = userID;
		this.mviName = mviName;
		Rating = rating;
	}

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	public String getMviName() {
		return mviName;
	}

	public void setMviName(String mviName) {
		this.mviName = mviName;
	}

	public int getRating() {
		return Rating;
	}

	public void setRating(int rating) {
		Rating = rating;
	}
	
	
}
