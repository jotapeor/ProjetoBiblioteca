package com.example.demo.resources;

import com.example.demo.entities.Editora;
import com.example.demo.services.EditoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/editoras")
public class EditoraResources {

    @Autowired
    private EditoraService service;

    @GetMapping
    public ResponseEntity<List<Editora>> findAll() {
        List<Editora> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Editora> findById(@PathVariable Long id) {
        Editora obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}