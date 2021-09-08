package com.mvi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mvi.bean.CatelogList;
import com.mvi.bean.MovieInfo;
import com.mvi.bean.Rating;
import com.mvi.bean.RatingList;
import com.mvi.bean.Catelog;

@Service
public class CatelogServiceImpl implements CatelogService {

	@Autowired
	private RestTemplate restTemplate;
	@Override
	public CatelogList getCatelogbyId(String id) {
		
		List<Catelog> catelogL=new ArrayList<>();
		RatingList ratingList = restTemplate.getForObject("http://localhost:9092/Ratings/"+id, RatingList.class);
		for(Rating rating:ratingList.getRatings())
		{
			MovieInfo movieInfo = restTemplate.getForObject("http://localhost:9090/movies/"+rating.getMviId(), MovieInfo.class);
			Catelog catelog = new Catelog(id,movieInfo.getMviName(),rating.getRating());
			catelogL.add(catelog);
		}
		CatelogList catelogList = new CatelogList(catelogL);
		return catelogList;
	}

}
