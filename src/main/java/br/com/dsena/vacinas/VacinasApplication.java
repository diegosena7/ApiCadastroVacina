package br.com.dsena.vacinas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VacinasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VacinasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
