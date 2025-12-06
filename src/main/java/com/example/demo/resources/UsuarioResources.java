package com.example.demo.resources;

import com.example.demo.entities.Usuario;
import com.example.demo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResources {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public ResponseEntity<List<Usuario>> findAll() {
        List<Usuario> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Long id) {
        Usuario obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}