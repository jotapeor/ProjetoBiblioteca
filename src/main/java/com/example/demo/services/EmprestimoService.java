package com.example.demo.services;

import com.example.demo.entities.Emprestimo;
import com.example.demo.repositories.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmprestimoService {
    @Autowired
    private EmprestimoRepository emprestimoRepository;

    public List<Emprestimo> findAll() {
        return emprestimoRepository.findAll();
    }

    public Emprestimo findById(Long id) {
        Optional<Emprestimo> obj = emprestimoRepository.findById(id);
        return obj.get();
    }

    public Emprestimo insert(Emprestimo obj) {
        return emprestimoRepository.save(obj);
    }

    public void delete(Long id) {
        emprestimoRepository.deleteById(id);
    }

    public Emprestimo update(Long id, Emprestimo obj) {
        Emprestimo entity = emprestimoRepository.getReferenceById(id);
        updateData(entity, obj);
        return emprestimoRepository.save(entity);
    }

    private void updateData(Emprestimo entity, Emprestimo obj) {
        entity.setDataEmprestimo(obj.getDataEmprestimo());
        entity.setDataDevolucaoPrevista(obj.getDataDevolucaoPrevista());
        entity.setLivro(obj.getLivro());
        entity.setUsuario(obj.getUsuario());
        entity.setDataDevolucaoReal(obj.getDataDevolucaoReal());
        entity.setStatus(obj.getStatus());
    }
}