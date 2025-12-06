package com.example.demo.resources;

import com.example.demo.entities.Livro;
import com.example.demo.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/livros")
public class LivroResources {

    @Autowired
    private LivroService service;

    @GetMapping
    public ResponseEntity<List<Livro>> findAll() {
        List<Livro> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Livro> findById(@PathVariable Long id) {
        Livro obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}