package com.cice.modelo.Clases;

import com.cice.modelo.Enums.EnumVisitable;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 */
public class AreaProtegidaTerrestre extends AreaProtegida {
    private String tipoTerreno;


    public AreaProtegidaTerrestre(float extension, int numeroEspecies, String nombre, float subvencion, String ong, EnumVisitable enumVisitable, String tipoTerreno) {
        super(extension, numeroEspecies, nombre, subvencion, ong, enumVisitable);
        this.tipoTerreno = tipoTerreno;
    }

    public AreaProtegidaTerrestre() {
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
