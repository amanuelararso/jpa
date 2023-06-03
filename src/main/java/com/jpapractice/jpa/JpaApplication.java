package com.jpapractice.jpa;

import com.jpapractice.jpa.models.File;
import com.jpapractice.jpa.models.Text;
import com.jpapractice.jpa.models.Video;
import com.jpapractice.jpa.repositories.FileRepository;
import com.jpapractice.jpa.repositories.TextRepository;
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
			VideoRepository videoRepository,
			FileRepository fileRepository,
			TextRepository textRepository
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

			var file = File.builder()
					.name("File 1")
					.url("www.resource.com/file1")
					.size(12) // MB
					.type("pdf")
					.build();

			fileRepository.save(file);

			var text = Text.builder()
					.name("text1")
					.url("www.resource.com/text1")
					.size(5) // MB
					.content("Json")
					.build();

			textRepository.save(text);
		};
	}


}
