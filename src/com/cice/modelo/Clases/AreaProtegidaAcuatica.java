package com.cice.modelo.Clases;

import com.cice.modelo.Enums.EnumVisitable;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 */
public class AreaProtegidaAcuatica extends AreaProtegida {

    private int numeroLagos;

    public AreaProtegidaAcuatica(float extension, int numeroEspecies, String nombre, float subvencion, String ong, EnumVisitable enumVisitable,  int numeroLagos) {
        super(extension, numeroEspecies, nombre, subvencion, ong, enumVisitable);
        this.numeroLagos = numeroLagos;
    }

    public AreaProtegidaAcuatica() {
    }
    public int getNumeroLagos() {
        return numeroLagos;
    }

    public void setNumeroLagos(int numeroLagos) {
        this.numeroLagos = numeroLagos;
    }
    @Override
    public String mostrarInformacion() {
        return "Area Protegida Acuatica{" +
                "extension=" + this.getExtension() +
                ", numeroEspecies=" + this.getNumeroEspecies() +
                ", nombre='" + this.getNombre() + '\'' +
                "número de lagos=" + this.numeroLagos +
                '}';
    }

    @Override
    public String mostrarNombre() {
        return "Area Protegida Acuatica --> Nombre: +" + this.getNombre();
    }

}
