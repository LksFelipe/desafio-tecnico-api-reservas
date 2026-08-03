package com.lksfelipe.api_reservas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lksfelipe.api_reservas.models.Sala;
import com.lksfelipe.api_reservas.repositories.SalaRepository;

@Service
public class SalaService {

    @Autowired 
    private SalaRepository salaRepository;

    public void salvar(Sala sala) {
        this.salaRepository.save(sala);
    }

    public Iterable<Sala> listar() {
        return this.salaRepository.findAll();
    }

    public Optional<Sala> buscarPorId(Long id) {
        return this.salaRepository.findById(id);
    }

    public void excluir(Sala sala) {
        this.salaRepository.delete(sala);
    }

}
