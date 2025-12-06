package com.example.demo.resources;

import com.example.demo.entities.Emprestimo;
import com.example.demo.services.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/emprestimos")
public class EmprestimoResources {

    @Autowired
    private EmprestimoService service;

    @GetMapping
    public ResponseEntity<List<Emprestimo>> findAll() {
        List<Emprestimo> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Emprestimo> findById(@PathVariable Long id) {
        Emprestimo obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}