package com.cintiabelem.atp62;

import com.cintiabelem.atp62.model.Clientes;
import com.cintiabelem.atp62.repository.ClienteRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Atp62Application implements CommandLineRunner {
	private ClienteRepository repository;

	public Atp62Application(ClienteRepository repository) {
		this.repository = repository;
	}



	public static void main(String[] args) {
		SpringApplication.run(Atp62Application.class, args);
	}

	

	@Override
	public void run(String... args) throws Exception {
		Clientes model = new Clientes();

		model.setNome("Cintia");
		repository.save(model);

		repository.findAll().forEach(f -> System.out.printf("%d - %s\n", f.getId(),
		f.getNome()));
		System.out.println("\n");

	}
}
