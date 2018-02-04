package com.cice.modelo.Clases;

public class AreaProtegidaNoClasificada extends AreaProtegida{
    private float extension;
    private int numeroEspecies;
    private String nombre;

    public AreaProtegidaNoClasificada(float extension, int numeroEspecies, String nombre) {
        this.extension = extension;
        this.numeroEspecies = numeroEspecies;
        this.nombre = nombre;
    }

    public AreaProtegidaNoClasificada() {
    }

    @Override
    public float getExtension() {
        return extension;
    }

    @Override
    public void setExtension(float extension) {
        this.extension = extension;
    }

    @Override
    public int getNumeroEspecies() {
        return numeroEspecies;
    }

    @Override
    public void setNumeroEspecies(int numeroEspecies) {
        this.numeroEspecies = numeroEspecies;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
