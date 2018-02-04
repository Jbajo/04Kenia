package com.cice.modelo.Clases;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 */
public class AreaProtegidaAcuatica extends AreaProtegida {
    private float extension;
    private int numeroEspecies;
    private String nombre;
    private int numeroLagos;

    public AreaProtegidaAcuatica(float extension, int numeroEspecies, String nombre, int numeroLagos) {
        this.extension = extension;
        this.numeroEspecies = numeroEspecies;
        this.nombre = nombre;
        this.numeroLagos = numeroLagos;
    }

    public AreaProtegidaAcuatica() {
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
