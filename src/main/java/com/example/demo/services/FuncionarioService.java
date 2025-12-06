package com.example.demo.services;

import com.example.demo.entities.Funcionario;
import com.example.demo.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }

    public Funcionario findById(Long id) {
        Optional<Funcionario> obj = funcionarioRepository.findById(id);
        return obj.get();
    }

    public Funcionario insert(Funcionario obj) {
        return funcionarioRepository.save(obj);
    }

    public void delete(Long id) {
        funcionarioRepository.deleteById(id);
    }

    public Funcionario update(Long id, Funcionario obj) {
        Funcionario entity = funcionarioRepository.getReferenceById(id);
        updateData(entity, obj);
        return funcionarioRepository.save(entity);
    }

    private void updateData(Funcionario entity, Funcionario obj) {
        entity.setNome(obj.getNome());
        entity.setCargo(obj.getCargo());
        entity.setSalario(obj.getSalario());
        entity.setMatricula(obj.getMatricula());
        entity.setDataAdmissao(obj.getDataAdmissao());
    }
}
