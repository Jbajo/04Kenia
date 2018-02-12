package com.cice.neogocio;

import com.cice.modelo.Clases.*;
import com.cice.modelo.Enums.EnumVisitable;
import com.cice.modelo.Interfaces.IParque;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 */
public class GestionParques {
    private ArrayList<IParque> listaParques= new ArrayList <>();

    /**
     * Método showMenu muestra el menú de la aplicación
     */
    public void showMenu(){
        Scanner sc = new Scanner (System.in);
        int opcion;

        do {
            System.out.println("Bienvenido a tu Gestion de Parques");
            System.out.println("Esto es lo que puedo hacer por ti:");
            System.out.println("1. Crear Reserva");
            System.out.println("2. Crear Area Protegida");
            System.out.println("3. Mostrar Parques");
            System.out.println("4. Mostrar nombre de los Parques");
            System.out.println("5. Visitar Parque");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            controles (opcion);
        }while (opcion!=0);
        sc.close();
    }

    /**
     * Método controles llama a los distintos métodos de la aplicación
     * @param opcion seleccionada
     */
    private void controles (int opcion) {
        switch (opcion){
            case 0:
                break;
            case 1:
                //crear Reserva
                crearReserva();
                break;
            case 2:
                //crear Area Protegida
                crearAreaProtegida();
                break;
            case 3:
                //crear Parques
                mostrarParques();
                break;
            case 4:
                //crear Nombre Parques
                mostrarNombreParques();
                break;
            case 5:
                //visitar Parque
                visitarParque();
                break;
            default:
                System.out.println("la opcion seleccionada no es valida");
                break;
        }
    }

    /**
     * Método crearReserva crea una Reserva pidiendo al usuario los datos y la introduce en el ArrayList
     */

    private void crearReserva(){
       Scanner sc = new Scanner (System.in);

       float extension;
       int numeroEspecies;
       String nombre;
       float licencia;
       String tipoArma;
       boolean bandera = false;

       System.out.println("Introduzca una extension --> ");
       extension =  Float.parseFloat(sc.nextLine());
       System.out.println("Introduzca el numero de especies --> ");
       numeroEspecies = Integer.parseInt(sc.nextLine());
       do {
           bandera = false;
           System.out.println("Introduzca un nombre --> ");
           nombre = sc.nextLine();
           for (IParque parque : listaParques) {
               if (parque.comprobarNombre(nombre))
                   bandera = true;
           }
           if(bandera)
               System.out.println("Opcion erronea...");
       }while (bandera);

       System.out.println("Introduzca una licencia --> ");
       licencia =  Float.parseFloat(sc.nextLine());
       System.out.println("Introduzca el tipo de Arma --> ");
       tipoArma = sc.nextLine();

       ReservaDeCaza reserva = new ReservaDeCaza(extension, numeroEspecies, nombre, licencia, tipoArma, EnumVisitable.RESERVADECAZA);
       listaParques.add(reserva);
    }

    /**
     * Método crearAreaProtegida muestra al usuario las distintas Areas Protegidas a crear
     */
    private void crearAreaProtegida(){
        Scanner sc = new Scanner (System.in);
        int opcion = 1;

        do {
            if (opcion < 1 || opcion > 3)
                System.out.println("Opcion no valida....");
            System.out.println("Seleccione el tipo de Reserva");
            System.out.println("1) Area Protegida Terrestre");
            System.out.println("2) Area Protegida Acuatica");
            System.out.println("3) Area Protegida No Clasificada");
            opcion = Integer.parseInt(sc.nextLine());
        }while (opcion< 1 || opcion > 3);

        switch (opcion){
            case 1:
                crearAreaProtegidaTerrestre();
                break;
            case 2:
                crearAreaProtegidaAcuatica();
                break;
            case 3:
                crearAreaProtegidaNoClasificada();
                break;
            default:
                break;

        }

    }

    /**
     * Método crearAreaProtegidaTerrestre crea un Area Protegida Terrestre pidiendo al usuario los datos y la introduce en el ArrayList
     */
    private void crearAreaProtegidaTerrestre(){
        Scanner sc = new Scanner (System.in);
        float extension;
        int numeroEspecies;
        String nombre;
        String tipoTerreno;
        boolean bandera = false;
        float subvencion;
        String ong;

        System.out.println("Introduzca la extension");
        extension = Float.parseFloat(sc.nextLine());
        System.out.println("Introduzca el numero de especies");
        numeroEspecies = Integer.parseInt(sc.nextLine());
        do {
            bandera = false;
            System.out.println("Introduzca un nombre --> ");
            nombre = sc.nextLine();
            for (IParque parque : listaParques) {
                if (parque.comprobarNombre(nombre))
                    bandera = true;
            }
            if(bandera)
                System.out.println("Opcion erronea...");
        }while (bandera);
        System.out.println("Introduzca un tipo de Terreno --> ");
        tipoTerreno = sc.nextLine();
        System.out.println("Introduzca la subvención concedida --> ");
        subvencion =Integer.parseInt(sc.nextLine());
        System.out.println("Introduzca el nombre de la ONG --> ");
        ong = sc.nextLine();
        AreaProtegidaTerrestre areaTerrestre = new AreaProtegidaTerrestre(extension, numeroEspecies, nombre, subvencion, ong, EnumVisitable.AREAPROTEGIDATERRESTRE, tipoTerreno);
        listaParques.add(areaTerrestre);
    }


    /**
     * Método crearAreaProtegidaAcuatica crea un Area Protegida Acuatica pidiendo al usuario los datos y la introduce en el ArrayList
     */
    private void crearAreaProtegidaAcuatica(){
        Scanner sc = new Scanner (System.in);
        float extension;
        int numeroEspecies;
        String nombre;
        int numeroLagos;
        boolean bandera = false;
        String ong;
        float subvencion;

        System.out.println("Introduzca la extension");
        extension = Float.parseFloat(sc.nextLine());
        System.out.println("Introduzca el numero de especies");
        numeroEspecies = Integer.parseInt(sc.nextLine());
        do {
            bandera = false;
            System.out.println("Introduzca un nombre --> ");
            nombre = sc.nextLine();
            for (IParque parque : listaParques) {
                if (parque.comprobarNombre(nombre))
                    bandera = true;
            }
            if(bandera)
                System.out.println("Opcion erronea...");
        }while (bandera);
        System.out.println("Introduzca el numero de Lagos --> ");
        numeroLagos = Integer.parseInt(sc.nextLine());
        System.out.println("Introduzca la subvención concedida --> ");
        subvencion =Integer.parseInt(sc.nextLine());
        System.out.println("Introduzca el nombre de la ONG --> ");
        ong = sc.nextLine();

        AreaProtegidaAcuatica areaAcuatica = new AreaProtegidaAcuatica(extension, numeroEspecies, nombre,  subvencion, ong, EnumVisitable.AREAPROTEGIDAACUATICA, numeroLagos);
        listaParques.add(areaAcuatica);
    }


    /**
     * Método crearAreaProtegidaNoClasificada crea un Area Protegida No Clasificada pidiendo al usuario los datos y la introduce en el ArrayList
     */

    private void crearAreaProtegidaNoClasificada(){
        Scanner sc = new Scanner (System.in);
        float extension;
        int numeroEspecies;
        String nombre;
        boolean bandera = false;
        String ong;
        float subvencion;

        System.out.println("Introduzca la extension");
        extension = Float.parseFloat(sc.nextLine());
        System.out.println("Introduzca el numero de especies");
        numeroEspecies = Integer.parseInt(sc.nextLine());
        do {
            bandera = false;
            System.out.println("Introduzca un nombre --> ");
            nombre = sc.nextLine();
            for (IParque parque : listaParques) {
                if (parque.comprobarNombre(nombre))
                    bandera = true;
            }
            if(bandera)
                System.out.println("Opcion erronea...");
        }while (bandera);
        System.out.println("Introduzca la subvención concedida --> ");
        subvencion =Integer.parseInt(sc.nextLine());
        System.out.println("Introduzca el nombre de la ONG --> ");
        ong = sc.nextLine();

        AreaProtegidaNoClasificada areaNoClasificada = new AreaProtegidaNoClasificada(extension, numeroEspecies, nombre, subvencion, ong, EnumVisitable.AREAPROTEGIDANOCLASIFICADA);
        listaParques.add(areaNoClasificada);
    }

    /**
     * Método mostrarParques muestra los Parques del ArrayList por pantalla
     */
    private void mostrarParques(){
        int i = 0;
        for (IParque parque : listaParques){
            System.out.println(i+ " ) "+parque.mostrarInformacion());
            i++;
        }

    }

    /**
     * Método mostrarNombreParques muestra los nombres de los Parques del ArrayList por pantalla
     */

    private void mostrarNombreParques(){
        int i = 0;
        for (IParque parque : listaParques){
            System.out.println("i) "+ parque.mostrarNombre());
            i++;
        }


    }

    private void visitarParque(){
        Scanner sc = new Scanner (System.in);
        int opcion;
        boolean bandera = false;

        for(IParque parque : listaParques){
            if(parque.isVisitado()==false)
                bandera = true;
        }
        if (bandera) {

            do {
                System.out.println("Seleccione un Parque (Solo son Visitables las Reservas de Caza)...");
                mostrarNombreParques();
                opcion = Integer.parseInt(sc.nextLine());
                opcion--;
            }
            while ((opcion < this.listaParques.size() - 1) || opcion >this.listaParques.size() - 1 || listaParques.get(opcion).getVisitable().isVisitable()==false);

            listaParques.get(opcion).visitarParque();
        }
        else{
            System.out.println("No existe ninguna Reserva de Caza en el sistema");
        }

    }

}
