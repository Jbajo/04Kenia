package com.cice.modelo.Enums;

public enum EnumVisitable {
    AREAPROTEGIDAACUATICA (false),
    AREAPROTEGIDATERRESTRE (false),
    AREAPROTEGIDANOCLASIFICADA (false),
    RESERVADECAZA (true);

    private boolean visitable;

    EnumVisitable(boolean visitable) {
        this.visitable = visitable;
    }

    public boolean isVisitable() {
        return visitable;
    }
}
