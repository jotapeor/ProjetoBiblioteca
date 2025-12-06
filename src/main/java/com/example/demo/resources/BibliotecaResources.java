package com.example.demo.resources;

import com.example.demo.entities.Biblioteca;
import com.example.demo.services.BibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/bibliotecas")
public class BibliotecaResources {

    @Autowired
    private BibliotecaService service;

    @GetMapping
    public ResponseEntity<List<Biblioteca>> findAll() {
        List<Biblioteca> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Biblioteca> findById(@PathVariable Long id) {
        Biblioteca obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}