package com.example.demo.resources;

import com.example.demo.entities.Autor;
import com.example.demo.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/autores")
public class AutorResources {

    @Autowired
    private AutorService service;

    @GetMapping
    public ResponseEntity<List<Autor>> findAll() {
        List<Autor> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Autor> findById(@PathVariable Long id) {
        Autor obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}