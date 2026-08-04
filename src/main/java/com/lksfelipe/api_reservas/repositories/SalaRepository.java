package com.lksfelipe.api_reservas.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lksfelipe.api_reservas.models.Sala;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Long> {

    @Query("SELECT s FROM Sala s WHERE s.nome = :nome")
    Optional<Sala> findByNome(String nome);
}
