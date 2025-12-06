package com.example.demo.services;

import com.example.demo.entities.Biblioteca;
import com.example.demo.repositories.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BibliotecaService {
    @Autowired
    private BibliotecaRepository bibliotecaRepository;

    public List<Biblioteca> findAll() {
        return bibliotecaRepository.findAll();
    }

    public Biblioteca findById(Long id) {
        Optional<Biblioteca> obj = bibliotecaRepository.findById(id);
        return obj.get();
    }

    public Biblioteca insert(Biblioteca obj) {
        return bibliotecaRepository.save(obj);
    }

    public void delete(Long id) {
        bibliotecaRepository.deleteById(id);
    }

    public Biblioteca update(Long id, Biblioteca obj) {
        Biblioteca entity = bibliotecaRepository.getReferenceById(id);
        updateData(entity, obj);
        return bibliotecaRepository.save(entity);
    }

    private void updateData(Biblioteca entity, Biblioteca obj) {
        entity.setNome(obj.getNome());
        entity.setEndereco(obj.getEndereco());
        entity.setTelefone(obj.getTelefone());
        entity.setListaDeLivros(obj.getListaDeLivros());
        entity.setListaDeUsuarios(obj.getListaDeUsuarios());
        entity.setFuncionarios(obj.getFuncionarios());
    }
}