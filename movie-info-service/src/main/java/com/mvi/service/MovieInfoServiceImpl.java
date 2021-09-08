package com.mvi.service;

import java.lang.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvi.bean.MovieInfo;
import com.mvi.persistence.MovieInfoDao;
@Service
public class MovieInfoServiceImpl implements MovieInfoService {

	@Autowired
	private MovieInfoDao movieInfoDao;
	@Override
	public MovieInfo findMviById(int id) {
		
		return movieInfoDao.getById(Integer.valueOf(id));
	}

}
