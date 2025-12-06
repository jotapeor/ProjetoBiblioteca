package com.example.demo.services;

import com.example.demo.entities.Editora;
import com.example.demo.repositories.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EditoraService {
    @Autowired
    private EditoraRepository editoraRepository;

    public List<Editora> findAll() {
        return editoraRepository.findAll();
    }

    public Editora findById(Long id) {
        Optional<Editora> obj = editoraRepository.findById(id);
        return obj.get();
    }

    public Editora insert(Editora obj) {
        return editoraRepository.save(obj);
    }

    public void delete(Long id) {
        editoraRepository.deleteById(id);
    }

    public Editora update(Long id, Editora obj) {
        Editora entity = editoraRepository.getReferenceById(id);
        updateData(entity, obj);
        return editoraRepository.save(entity);
    }

    private void updateData(Editora entity, Editora obj) {
        entity.setNome(obj.getNome());
        entity.setEndereco(obj.getEndereco());
        entity.setTelefone(obj.getTelefone());
        entity.setCnpj(obj.getCnpj());
    }
}