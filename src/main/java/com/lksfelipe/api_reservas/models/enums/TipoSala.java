package com.lksfelipe.api_reservas.models.enums;

public enum TipoSala {
    REUNIAOINDIVIDUAL(1, "Reunião Individual"),
    REUNIAOCOLETIVA(2, "Reunião Coletiva"),
    AUDITORIO(3, "Auditório");

    private int id;
    private String descricao;

    TipoSala(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoSala getById(int id) {
        for (TipoSala tipo : TipoSala.values()) {
            if (tipo.getId() == id) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("TipoSala inválido: " + id);
    }

}
