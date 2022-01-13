package com.cintiabelem.atp62.repository;

import com.cintiabelem.atp62.model.Clientes;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Clientes, Integer> {
    
}
