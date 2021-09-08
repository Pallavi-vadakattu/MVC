package com.mvi.main;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.mvi.bean.MovieInfo;
import com.mvi.persistence.MovieInfoDao;

@SpringBootApplication(scanBasePackages = "com.mvi")
@EnableJpaRepositories(basePackages = "com.mvi.persistence")
@EntityScan(basePackages = "com.mvi.bean")
public class MovieInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoServiceApplication.class, args);
	}
	

}