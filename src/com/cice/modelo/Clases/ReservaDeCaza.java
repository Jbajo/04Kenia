package com.cice.modelo.Clases;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 */
public class ReservaDeCaza extends ParqueNacional {
    private float licencia;
    private String tipoArma;

    public ReservaDeCaza(float extension, int numeroEspecies, String nombre, float licencia, String tipoArma) {
        super(extension, numeroEspecies, nombre);
        this.licencia = licencia;
        this.tipoArma = tipoArma;
    }

    public ReservaDeCaza() {
        super();
    }

    public float getLicencia() {
        return licencia;
    }

    public void setLicencia(float licencia) {
        this.licencia = licencia;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }
    @Override
    public String mostrarInformacion() {
        return "Reserva de Caza{" +
                "extension=" + this.getExtension() +
                ", numeroEspecies=" + this.getNumeroEspecies() +
                ", nombre='" + this.getNombre() + '\'' +
                "licencia=" + this.licencia +
                "tipo de arma=" + this.tipoArma +
                '}';
    }

    @Override
    public String mostrarNombre() {
        return "Reserva de Caza --> Nombre: +" + this.getNombre();
    }

}
