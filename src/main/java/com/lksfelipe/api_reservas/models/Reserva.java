package com.lksfelipe.api_reservas.models;

import java.time.LocalDate;
import java.time.LocalTime;

import com.lksfelipe.api_reservas.models.enums.StatusReserva;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reserva {

    private long id;
    private Sala sala;
    private LocalDate data;
    private LocalTime horaInicio;
    private LocalTime horaFim;
    private StatusReserva status;
}
