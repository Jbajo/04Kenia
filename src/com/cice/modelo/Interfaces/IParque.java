package com.cice.modelo.Interfaces;

import com.cice.modelo.Enums.EnumVisitable;

public interface IParque {
    String mostrarInformacion();
    String mostrarNombre();
    void visitarParque();
    boolean isVisitado();
    boolean comprobarNombre (String nombre);
    EnumVisitable getVisitable();
}
