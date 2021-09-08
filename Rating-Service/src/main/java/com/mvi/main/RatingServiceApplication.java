package com.mvi.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.mvi.bean.Rating;
import com.mvi.persistence.RatingDao;
@SpringBootApplication(scanBasePackages = "com.mvi")
@EnableJpaRepositories(basePackages = "com.mvi.persistence")
@EntityScan(basePackages = "com.mvi.bean")
public class RatingServiceApplication /*implements CommandLineRunner*/ {

//	@Autowired
//	private RatingDao ratingDao;
	public static void main(String[] args) {
		SpringApplication.run(RatingServiceApplication.class, args);
	}
//	@Override
//	public void run(String... args) throws Exception {
//		
//		ratingDao.save(new Rating(11,"U01",1,4));
//		ratingDao.save(new Rating(12,"U02",3,5));
//		ratingDao.save(new Rating(13,"U01",2,5));
//		ratingDao.save(new Rating(14,"U03",4,3));
//		ratingDao.save(new Rating(15,"U01",4,3));
//		ratingDao.save(new Rating(16,"U03",1,2));
//		ratingDao.save(new Rating(17,"U02",1,2));
//		ratingDao.save(new Rating(18,"U03",2,5));
//	}

}
