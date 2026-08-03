package com.lksfelipe.api_reservas.models;

import java.time.LocalDate;
import java.time.LocalTime;

import com.lksfelipe.api_reservas.models.enums.StatusReserva;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "reservas")
@AllArgsConstructor
@NoArgsConstructor
public class Reserva {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "sala_id")
    private Sala sala;

    private LocalDate data;

    private LocalTime horaInicio;

    private LocalTime horaFim;

    @Enumerated(value = EnumType.STRING)
    private StatusReserva status;
}
