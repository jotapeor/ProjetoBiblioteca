package com.example.demo.services;

import com.example.demo.entities.Livro;
import com.example.demo.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> findAll() {
        return livroRepository.findAll();
    }

    public Livro findById(Long id) {
        Optional<Livro> obj = livroRepository.findById(id);
        return obj.get();
    }

    public Livro insert(Livro obj) {
        return livroRepository.save(obj);
    }

    public void delete(Long id) {
        livroRepository.deleteById(id);
    }

    public Livro update(Long id, Livro obj) {
        Livro entity = livroRepository.getReferenceById(id);
        updateData(entity, obj);
        return livroRepository.save(entity);
    }

    private void updateData(Livro entity, Livro obj) {
        entity.setTitulo(obj.getTitulo());
        entity.setAnoPublicacao(obj.getAnoPublicacao());
        entity.setIsbn(obj.getIsbn());
        entity.setAutor(obj.getAutor());
        entity.setEditora(obj.getEditora());
        entity.setGenero(obj.getGenero());
        entity.setQuantidadeExemplares(obj.getQuantidadeExemplares());
        entity.setExemplaresDisponiveis(obj.getExemplaresDisponiveis());
    }
}
