package com.jpapractice.jpa;

import com.jpapractice.jpa.models.Video;
import com.jpapractice.jpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner (
			VideoRepository videoRepository
	) {
		return args -> {
			var video = Video.builder()
					.name("Video 1")
					.url("www.resource.com/video1")
					.size(20) // in MB
					.length(10) // minutes

					.build();

			videoRepository.save(video);
			/*
		|---------------+----+---------+------+-------------------------+------+---------+--------+
		| resource_type | id | name    | size | url                     | type | content | length |
		+---------------+----+---------+------+-------------------------+------+---------+--------+
		| V             |  1 | Video 1 |   20 | www.resource.com/video1 | NULL | NULL    |     10 |
		+---------------+----+---------+------+-------------------------+------+---------+--------+
			* */
		};
	}

}
