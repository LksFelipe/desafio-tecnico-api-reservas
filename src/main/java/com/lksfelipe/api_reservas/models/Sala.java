package com.lksfelipe.api_reservas.models;

import java.util.List;

import com.lksfelipe.api_reservas.models.enums.TipoSala;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "salas")
@AllArgsConstructor
@NoArgsConstructor
public class Sala {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    @OneToMany(mappedBy = "sala")
    private List<Reserva> reservas;

    @Enumerated(value = EnumType.STRING)
    private TipoSala tipoSala;

}
