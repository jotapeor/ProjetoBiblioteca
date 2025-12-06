package com.example.demo.resources;

import com.example.demo.entities.Reserva;
import com.example.demo.services.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/reservas")
public class ReservaResources {

    @Autowired
    private ReservaService service;

    @GetMapping
    public ResponseEntity<List<Reserva>> findAll() {
        List<Reserva> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Reserva> findById(@PathVariable Long id) {
        Reserva obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}