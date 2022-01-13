package com.cintiabelem.atp64.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.cintiabelem.atp64.model.ClienteModel;
import com.cintiabelem.atp64.repository.ClienteRepository;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {

    private ClienteRepository repository;

    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }


    


    @GetMapping("/cadastro-clientes")
    public String clientes(HttpServletRequest req){
        List<ClienteModel> lista =  (List<ClienteModel>)repository.findAll();
        req.setAttribute("clientes", lista);
        return "clientes";
    }
    
}
