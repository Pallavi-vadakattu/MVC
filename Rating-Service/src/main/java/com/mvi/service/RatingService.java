package com.mvi.service;

import java.util.List;

import com.mvi.bean.Rating;

public interface RatingService {

	List<Rating> getRatingById(String userId);
}
