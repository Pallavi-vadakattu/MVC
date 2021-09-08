package com.mvi.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.mvi.bean.RatingList;
import com.mvi.service.RatingService;

@RestController
public class RatingRecource {

	@Autowired
	private RatingService ratingService;
	@GetMapping(value="Ratings/{id}")
	public RatingList getAllRatingList(@PathVariable String id)
	{
		RatingList ratingList = new RatingList();
		ratingList.setRatings(ratingService.getRatingById(id));
		return ratingList;
	}
	
}
