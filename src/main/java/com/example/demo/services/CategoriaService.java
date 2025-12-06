package com.example.demo.services;

import com.example.demo.entities.Categoria;
import com.example.demo.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    public Categoria findById(Long id) {
        Optional<Categoria> obj = categoriaRepository.findById(id);
        return obj.get();
    }

    public Categoria insert(Categoria obj) {
        return categoriaRepository.save(obj);
    }

    public void delete(Long id) {
        categoriaRepository.deleteById(id);
    }

    public Categoria update(Long id, Categoria obj) {
        Categoria entity = categoriaRepository.getReferenceById(id);
        updateData(entity, obj);
        return categoriaRepository.save(entity);
    }

    private void updateData(Categoria entity, Categoria obj) {
        entity.setNome(obj.getNome());
        entity.setDescricao(obj.getDescricao());
        entity.setLivros(obj.getLivros());
    }
}