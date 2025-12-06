package com.example.demo.resources;

import com.example.demo.entities.Funcionario;
import com.example.demo.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/funcionarios")
public class FuncionarioResources {

    @Autowired
    private FuncionarioService service;

    @GetMapping
    public ResponseEntity<List<Funcionario>> findAll() {
        List<Funcionario> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Funcionario> findById(@PathVariable Long id) {
        Funcionario obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}