package com.mvi.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvi.bean.Rating;

@Repository
public interface RatingDao extends JpaRepository<Rating, Integer> {

	public List<Rating> findByUserId(String userID);
}
