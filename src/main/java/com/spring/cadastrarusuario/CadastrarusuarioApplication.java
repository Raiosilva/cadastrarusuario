package com.spring.cadastrarusuario;

import com.spring.cadastrarusuario.models.Person;
import com.spring.cadastrarusuario.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CadastrarusuarioApplication implements CommandLineRunner {

	@Autowired
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(CadastrarusuarioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Person p1 = new Person(null, "Raimundo Oliveira", "raimundo@gmail.com");
		Person p2 = new Person(null, "Paulo Arcenio", "paulo@gmail.com");

		personRepository.saveAll(Arrays.asList(p1, p2));
	}
}
