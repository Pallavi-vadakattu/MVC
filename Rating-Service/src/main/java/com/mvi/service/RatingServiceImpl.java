package com.mvi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvi.bean.Rating;
import com.mvi.persistence.RatingDao;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingDao ratingDao;
	@Override
	public List<Rating> getRatingById(String userId) {
		
		return ratingDao.findByUserId(userId);
	}

}
