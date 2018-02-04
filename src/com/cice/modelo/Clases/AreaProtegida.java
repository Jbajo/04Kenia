package com.cice.modelo.Clases;

import com.cice.modelo.Interfaces.IParque;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 */

public abstract class AreaProtegida extends ParqueNacional{
    private float subvencion;
    private String ong;

    public AreaProtegida(float extension, int numeroEspecies, String nombre, float subvencion, String ong) {
        super(extension, numeroEspecies, nombre);
        this.subvencion = subvencion;
        this.ong = ong;

    }

    public AreaProtegida() {
        super();
    }

    public float getSubvencion() {
        return subvencion;
    }

    public void setSubvencion(float subvencion) {
        this.subvencion = subvencion;
    }

    public String getOng() {
        return ong;
    }

    public void setOng(String ong) {
        this.ong = ong;
    }

    @Override
    public String mostrarInformacion() {
        return "Area Protegida{" +
                "extension=" + this.getExtension() +
                ", numeroEspecies=" + this.getNumeroEspecies() +
                ", nombre='" + this.getNombre() + '\'' +
                "subvencion=" + subvencion +
                ", ong='" + ong + '\'' +
                '}';
    }

    @Override
    public String mostrarNombre() {
        return "Area Protegida --> Nombre: +" + this.getNombre();
    }
}
