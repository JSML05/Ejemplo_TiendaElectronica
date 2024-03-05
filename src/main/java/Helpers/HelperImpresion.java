/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Computador;
import Logica_Negocio.Persona;
import java.util.ArrayList;

/**
 *
 * @author jsml
 */
public class HelperImpresion {

    public static void ImprimirPersona(ArrayList<Persona> Lista_personas) {
        for (int i = 0; i < Lista_personas.size(); i++) {
            System.out.println("\n");
            System.out.println("Los datos de la persona son " + (i + 1) + " :");
            System.out.println("\n");
            System.out.println("Nombre: " + "\t" + Lista_personas.get(i).getNombre());
            System.out.println("Apellido: " + "\t" + Lista_personas.get(i).getApellido());
            System.out.println("Cedula: " + "\t" + Lista_personas.get(i).getCedula());
            System.out.println("Direccion: " + "\t" + Lista_personas.get(i).getDireccion());
            System.out.println("\n");

            for (int j = 0; j < Lista_personas.get(i).getComputadores().size(); j++) {
                System.out.println("Computador " + (j + 1) + " :");
                System.out.println("\n");
                System.out.println("Marca: " + "\t" + Lista_personas.get(i).getComputadores().get(j).getMarca());
                System.out.println("Serial: " + "\t" + Lista_personas.get(i).getComputadores().get(j).getSerial());
                System.out.println("Tamaño: " + "\t" + Lista_personas.get(i).getComputadores().get(j).getTamaño());
                System.out.println("Color: " + "\t" + Lista_personas.get(i).getComputadores().get(j).getColor());
                System.out.println("\n");

            }
        }

    }

    public static void ImprimirPersonaBuscada(ArrayList<Persona> Lista_personas, String Ce_buscar) {
        int bandera = 0;
        for (int i = 0; i < Lista_personas.size(); i++) {

            if (Ce_buscar.equals(Lista_personas.get(i).getCedula())) {

                bandera = 1;
                System.out.println("\n");
                System.out.println("Los datos de la persona son: ");
                System.out.println("\n");
                System.out.println("Nombre: " + "\t" + Lista_personas.get(i).getNombre());
                System.out.println("Apellido: " + "\t" + Lista_personas.get(i).getApellido());
                System.out.println("Cedula: " + "\t" + Lista_personas.get(i).getCedula());
                System.out.println("Direccion: " + "\t" + Lista_personas.get(i).getDireccion());
                System.out.println("\n");

                for (int j = 0; j < Lista_personas.get(i).getComputadores().size(); j++) {
                    System.out.println("Computador " + (j + 1) + " :");
                    System.out.println("\n");
                    System.out.println("Marca: " + "\t" + Lista_personas.get(i).getComputadores().get(j).getMarca());
                    System.out.println("Serial: " + "\t" + Lista_personas.get(i).getComputadores().get(j).getSerial());
                    System.out.println("Tamaño: " + "\t" + Lista_personas.get(i).getComputadores().get(j).getTamaño());
                    System.out.println("Color: " + "\t" + Lista_personas.get(i).getComputadores().get(j).getColor());
                    System.out.println("\n");

                }
            }

        }
        if (bandera == 0) {
            System.out.println("La cedula ingreada no existe");
        }
    }
}
