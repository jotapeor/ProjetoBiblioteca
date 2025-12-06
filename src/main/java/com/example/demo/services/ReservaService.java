package com.example.demo.services;

import com.example.demo.entities.Reserva;
import com.example.demo.repositories.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> findAll() {
        return reservaRepository.findAll();
    }

    public Reserva findById(Long id) {
        Optional<Reserva> obj = reservaRepository.findById(id);
        return obj.get();
    }

    public Reserva insert(Reserva obj) {
        return reservaRepository.save(obj);
    }

    public void delete(Long id) {
        reservaRepository.deleteById(id);
    }

    public Reserva update(Long id, Reserva obj) {
        Reserva entity = reservaRepository.getReferenceById(id);
        updateData(entity, obj);
        return reservaRepository.save(entity);
    }

    private void updateData(Reserva entity, Reserva obj) {
        entity.setDataReserva(obj.getDataReserva());
        entity.setUsuario(obj.getUsuario());
        entity.setLivro(obj.getLivro());
        entity.setStatus(obj.getStatus());
    }
}
