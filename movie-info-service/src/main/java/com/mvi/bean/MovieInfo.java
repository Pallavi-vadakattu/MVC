package com.mvi.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class MovieInfo {
@Id
private int mviId;
private String mviName;

public MovieInfo() {
}

public MovieInfo(int mviId, String mviName) {
	this.mviId = mviId;
	this.mviName = mviName;
}

public int getMviId() {
	return mviId;
}

public void setMviId(int mviId) {
	this.mviId = mviId;
}

public String getMviName() {
	return mviName;
}

public void setMviName(String mviName) {
	this.mviName = mviName;
}

}
