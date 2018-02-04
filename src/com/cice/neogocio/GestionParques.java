package com.cice.neogocio;

import com.cice.modelo.Clases.ReservaDeCaza;
import com.cice.modelo.Interfaces.IParque;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

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
                //crear un Libro
                crearReserva();
                break;
            case 2:
                //crear una Revista
                crearAreaProtegida();
                break;
            case 3:
                //crear un Comic
                mostrarParques();
                break;
            case 4:
                //crear un Disco
                mostrarNombreParques();
                break;
            case 5:
                //mostrar Recursos no Prestados
            //    visitarParque();
                break;
            default:
                System.out.println("la opcion seleccionada no es valida");
                break;
        }
    }

    private void crearReserva(){
       Scanner sc = new Scanner (System.in);

       float extension;
       int numeroEspecies;
       String nombre;
       float licencia;
       String tipoArma;

       System.out.println("Introduzca una extension --> ");
       extension =  Float.parseFloat(sc.nextLine());
       System.out.println("Introduzca el numero de especies --> ");
       numeroEspecies = Integer.parseInt(sc.nextLine());
       System.out.println("Introduzca un nombre --> ");
       nombre = sc.nextLine();
       System.out.println("Introduzca una licencia --> ");
       licencia =  Float.parseFloat(sc.nextLine());
       System.out.println("Introduzca el tipo de Arma --> ");
       tipoArma = sc.nextLine();

       ReservaDeCaza reserva = new ReservaDeCaza(extension, numeroEspecies, nombre, licencia, tipoArma);
       listaParques.add(reserva);
    }

    private void crearAreaProtegida(){
        Scanner sc = new Scanner (System.in);
        int opcion;

    }

    private void mostrarParques(){

        for (IParque parque : listaParques){
            System.out.println(parque.mostrarInformacion());
        }

    }

    private void mostrarNombreParques(){
        for (IParque parque : listaParques){
            System.out.println(parque.mostrarNombre());
        }


    }

}
