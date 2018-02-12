package com.cice.modelo.Clases;

import com.cice.modelo.Enums.EnumVisitable;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 */
public class AreaProtegidaNoClasificada extends AreaProtegida{

    public AreaProtegidaNoClasificada(float extension, int numeroEspecies, String nombre, float subvencion, String ong, EnumVisitable enumVisitable) {
        super(extension, numeroEspecies, nombre, subvencion, ong, enumVisitable);
    }

    public AreaProtegidaNoClasificada() {
    }

    @Override
    public String mostrarInformacion() {
        return "Area Protegida No Clasificada{" +
                "extension=" + this.getExtension() +
                ", numeroEspecies=" + this.getNumeroEspecies() +
                ", nombre='" + this.getNombre() + '\'' +
                '}';
    }

    @Override
    public String mostrarNombre() {
        return "Area Protegida No Clasificada --> Nombre: +" + this.getNombre();
    }


}
