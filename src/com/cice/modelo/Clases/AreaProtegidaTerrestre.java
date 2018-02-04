package com.cice.modelo.Clases;

public class AreaProtegidaTerrestre extends AreaProtegida {
    private float extension;
    private int numeroEspecies;
    private String nombre;
    private String tipoTerreno;

    public AreaProtegidaTerrestre(float extension, int numeroEspecies, String nombre, String tipoTerreno) {
        this.extension = extension;
        this.numeroEspecies = numeroEspecies;
        this.nombre = nombre;
        this.tipoTerreno = tipoTerreno;
    }

    public AreaProtegidaTerrestre() {
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

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }

    @Override
    public String mostrarInformacion() {
        return "Area Protegida Terrestre{" +
                "extension=" + this.getExtension() +
                ", numeroEspecies=" + this.getNumeroEspecies() +
                ", nombre='" + this.getNombre() + '\'' +
                "tipo de terreno=" + this.tipoTerreno +
                '}';
    }

    @Override
    public String mostrarNombre() {
        return "Area Protegida Terrestre --> Nombre: +" + this.getNombre();
    }

}
