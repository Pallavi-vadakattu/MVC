package com.mvi.bean;

import java.util.List;

public class CatelogList {

	private List<Catelog> catelogList;

	public List<Catelog> getCatelogList() {
		return catelogList;
	}
	
	
	public CatelogList() {
	}

	public CatelogList(List<Catelog> catelogList) {
		this.catelogList = catelogList;
	}


	public void setCatelogList(List<Catelog> catelogList) {
		this.catelogList = catelogList;
	}
	
}
