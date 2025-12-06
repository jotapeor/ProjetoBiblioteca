package com.example.demo.services;

import com.example.demo.entities.Autor;
import com.example.demo.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> findAll() {
        return autorRepository.findAll();
    }

    public Autor findById(Long id) {
        Optional<Autor> obj = autorRepository.findById(id);
        return obj.get();
    }

    public Autor insert(Autor obj) {
        return autorRepository.save(obj);
    }

    public void delete(Long id) {
        autorRepository.deleteById(id);
    }

    public Autor update(Long id, Autor obj) {
        Autor entity = autorRepository.getReferenceById(id);
        updateData(entity, obj);
        return autorRepository.save(entity);
    }

    private void updateData(Autor entity, Autor obj) {
        entity.setNome(obj.getNome());
        entity.setBiografia(obj.getBiografia());
        entity.setDataNascimento(obj.getDataNascimento());
        entity.setNacionalidade(obj.getNacionalidade());
    }
}