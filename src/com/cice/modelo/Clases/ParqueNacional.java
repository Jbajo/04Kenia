package com.cice.modelo.Clases;

import com.cice.modelo.Interfaces.IParque;

public abstract class ParqueNacional implements IParque {
    private float extension;
    private int numeroEspecies;
    private String nombre;
    private boolean visitado;

    public ParqueNacional(float extension, int numeroEspecies, String nombre) {
        this.extension = extension;
        this.numeroEspecies = numeroEspecies;
        this.nombre = nombre;
    }

    public ParqueNacional() {
    }

    public float getExtension() {
        return extension;
    }

    public void setExtension(float extension) {
        this.extension = extension;
    }

    public int getNumeroEspecies() {
        return numeroEspecies;
    }

    public void setNumeroEspecies(int numeroEspecies) {
        this.numeroEspecies = numeroEspecies;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String mostrarInformacion() {
        return "ParqueNacional{" +
                "extension=" + extension +
                ", numeroEspecies=" + numeroEspecies +
                ", nombre='" + nombre + '\'' +
                '}';
    }
    @Override
    public String mostrarNombre() {
        return "Parque Nacional --> Nombre: +" + this.getNombre();
    }

    @Override
    public void visitarParque() {
        this.visitado = true;
    }
}
