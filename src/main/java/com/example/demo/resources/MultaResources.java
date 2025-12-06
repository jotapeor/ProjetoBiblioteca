package com.example.demo.resources;

import com.example.demo.entities.Multa;
import com.example.demo.services.MultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/multas")
public class MultaResources {

    @Autowired
    private MultaService service;

    @GetMapping
    public ResponseEntity<List<Multa>> findAll() {
        List<Multa> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Multa> findById(@PathVariable Long id) {
        Multa obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}