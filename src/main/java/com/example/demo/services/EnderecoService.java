package com.example.demo.services;

import com.example.demo.entities.Emprestimo;
import com.example.demo.entities.Endereco;
import com.example.demo.repositories.EmprestimoRepository;
import com.example.demo.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository EnderecoRepository;

    public List<Endereco> findAll() {
        return EnderecoRepository.findAll();
    }

    public Endereco findById(Long id) {
        Optional<Endereco> obj = EnderecoRepository.findById(id);
        return obj.get();
    }

    public Endereco insert(Endereco obj) {
        return EnderecoRepository.save(obj);
    }

    public void delete(Long id) {
        EnderecoRepository.deleteById(id);
    }

    public Endereco update(Long id, Endereco obj) {
        Endereco entity = EnderecoRepository.getReferenceById(id);
        updateData(entity, obj);
        return EnderecoRepository.save(entity);
    }

    private void updateData(Endereco entity, Endereco obj) {
        entity.setRua(obj.getRua());
        entity.setCidade(obj.getCidade());
        entity.setEstado(obj.getEstado());
        entity.setCep(obj.getCep());
        entity.setBairro(obj.getBairro());
        entity.setNumero(obj.getNumero());
    }
}
