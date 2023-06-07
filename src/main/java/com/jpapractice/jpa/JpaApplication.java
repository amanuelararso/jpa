package com.jpapractice.jpa;

import com.jpapractice.jpa.models.Author;
import com.jpapractice.jpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Iterator;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner (
			AuthorRepository authorRepository
	) {
		return args -> {
//			for (int i = 0; i < 50; i++) {
//				Faker faker = new Faker();
//				Author author = new Author();
//				author.setFirstName(faker.name().firstName());
//				author.setLastName(faker.name().lastName());
//				author.setAge(faker.number().numberBetween(30,50));
//				author.setCreatedAt(faker.date().birthday(15,60));
//				author.setLastModifiedAt(faker.date().birthday());
//				author.setLastModifiedBy(faker.funnyName().name());
//				authorRepository.save(author);
//			}
			var list = authorRepository.findByFirstName("Blair");
			Iterator<Author> iterator = list.iterator();
			while (iterator.hasNext()) {
				Author author = iterator.next();
				System.out.println(author.getAge() + " "+ author.getFirstName()+ " " + author.getLastName());
			}

		};
	}


}
