package com.lksfelipe.api_reservas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lksfelipe.api_reservas.models.Sala;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Long> {

}
