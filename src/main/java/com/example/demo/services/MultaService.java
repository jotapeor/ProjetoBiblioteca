package com.example.demo.services;

import com.example.demo.entities.Multa;
import com.example.demo.repositories.MultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MultaService {
    @Autowired
    private MultaRepository multaRepository;

    public List<Multa> findAll() {
        return multaRepository.findAll();
    }

    public Multa findById(Long id) {
        Optional<Multa> obj = multaRepository.findById(id);
        return obj.get();
    }

    public Multa insert(Multa obj) {
        return multaRepository.save(obj);
    }

    public void delete(Long id) {
        multaRepository.deleteById(id);
    }

    public Multa update(Long id, Multa obj) {
        Multa entity = multaRepository.getReferenceById(id);
        updateData(entity, obj);
        return multaRepository.save(entity);
    }

    private void updateData(Multa entity, Multa obj) {
        entity.setValor(obj.getValor());
        entity.setMotivo(obj.getMotivo());
        entity.setPago(obj.getPago());
        entity.setDataGeracao(obj.getDataGeracao());
    }
}
