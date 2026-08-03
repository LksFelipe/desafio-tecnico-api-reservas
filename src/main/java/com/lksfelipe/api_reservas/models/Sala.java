package com.lksfelipe.api_reservas.models;

import java.util.List;

import com.lksfelipe.api_reservas.models.enums.TipoSala;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sala {

    private long id;
    private String nome;
    private List<Reserva> reservas;
    private TipoSala tipoSala;

}
