package com.mvi.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvi.bean.MovieInfo;

@Repository
public interface MovieInfoDao extends JpaRepository<MovieInfo,Integer> {


}
