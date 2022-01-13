package com.cintiabelem.atp63;

import com.cintiabelem.atp63.model.Agencia;
import com.cintiabelem.atp63.model.Clientes;
import com.cintiabelem.atp63.repository.AgenciaRepository;
import com.cintiabelem.atp63.repository.ClienteRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Atp63Application implements CommandLineRunner {
	private ClienteRepository clienteRepository;
	private AgenciaRepository agenciaRepository;

	public Atp63Application(ClienteRepository repository1, AgenciaRepository repository2) {
		this.clienteRepository = repository1;
		this.agenciaRepository = repository2;
	}

	public static void main(String[] args) {
		SpringApplication.run(Atp63Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Clientes model = new Clientes();
		Agencia modelAgencia = new Agencia();

		model.setNome("Bruna");
		clienteRepository.save(model);

		// modelAgencia.setNumAgencia(2569);
		// agenciaRepository.save(modelAgencia);

		clienteRepository.findAll().forEach(f -> System.out.printf("%d - %s\n",
		f.getId(),
		f.getNome()));
		System.out.println("\n");

		agenciaRepository.findAll().forEach(f -> System.out.println(f.getNumAgencia()));

	}
}
