package com.lksfelipe.api_reservas.models.enums;

public enum StatusReserva {
    ATIVO(1, "Ativo"),
    PENDENTE(2, "Pendente"),
    CANCELADO(3, "Cancelado");

    private int id;
    private String descricao;

    StatusReserva(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public static StatusReserva getById(int id) {
        for (StatusReserva status : StatusReserva.values()) {
            if (status.getId() == id) {
                return status;
            }
        }
        throw new IllegalArgumentException("StatusReserva inválido: " + id);
    }
}
