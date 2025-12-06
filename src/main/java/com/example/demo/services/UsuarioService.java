package com.example.demo.services;

import com.example.demo.entities.Usuario;
import com.example.demo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario findById(Long id) {
        Optional<Usuario> obj = usuarioRepository.findById(id);
        return obj.get();
    }

    public Usuario insert(Usuario obj) {
        return usuarioRepository.save(obj);
    }

    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }

    public Usuario update(Long id, Usuario obj) {
        Usuario entity = usuarioRepository.getReferenceById(id);
        updateData(entity, obj);
        return usuarioRepository.save(entity);
    }

    private void updateData(Usuario entity, Usuario obj) {
        entity.setNome(obj.getNome());
        entity.setEmail(obj.getEmail());
        entity.setTelefone(obj.getTelefone());
        entity.setEndereco(obj.getEndereco());
        entity.setDataCadastro(obj.getDataCadastro());
        entity.setCpf(obj.getCpf());
        entity.setEmprestimosAtivos(obj.getEmprestimosAtivos());
    }
}