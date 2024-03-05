/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperImpresion;
import Helpers.HelperValidacion;
import Logica_Negocio.Computador;
import Logica_Negocio.Persona;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jsml
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaracion de variables

        //persona
        String Nombre = "";
        String Apellido = "";
        String Cedula = "";
        String Direccion = "";
        String Ce_buscar = "";

        //computador
        String Marca = "";
        String Serial = "";
        String Tamaño = "";
        String Color = "";

        //menu
        int opc = 0;
        int Num_comp = 0;

        //Funciones
        int retorno_num = 0;
        int retorno_ce = 0;
        int retorno_letra = 0;
        int retorno_ce2 = 0;
        int retorno_ced = 0;
        int retorno_can = 0;
        boolean retorno_vac;

        Scanner scan = new Scanner(System.in);
        ArrayList<Computador> Lista_global = null;
        ArrayList<Persona> Lista_personas = new ArrayList<>();

        do {
            System.out.println("Opciones: ");
            System.out.println("1. Registrar persona");
            System.out.println("2. Mostrar los datos de una persona y los computadores que posee");
            System.out.println("3. Mostrar toda la lista de personas");
            System.out.println("4. Salir");

            try {

                System.out.println("Digite la opcion");
                opc = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {

                System.out.println("Opcion no valida ");
                scan.next();

                break;
            }

            switch (opc) {
                case 1:
                    //añadir persona

                    //Nombre
                    System.out.println("Digite el nombre de la persona: ");
                    Nombre = scan.nextLine();

                    retorno_vac = HelperValidacion.ValidarVacio(Nombre);
                    while (retorno_vac) {
                        System.out.println("Digite el nombre de la persona: ");
                        Nombre = scan.nextLine();
                        retorno_vac = HelperValidacion.ValidarVacio(Nombre);
                    }

                    retorno_vac = HelperValidacion.ValidarVacio(Nombre);
                    retorno_num = HelperValidacion.RetornaValor(Nombre);
                    retorno_ce = HelperValidacion.RetornarValorCE(Nombre);

                    while (retorno_num != 0 || retorno_ce != 0 || retorno_vac == true) {
                        System.out.println("Digite el nombre de la persona: ");
                        Nombre = scan.nextLine();

                        retorno_vac = HelperValidacion.ValidarVacio(Nombre);
                        retorno_num = HelperValidacion.RetornaValor(Nombre);
                        retorno_ce = HelperValidacion.RetornarValorCE(Nombre);
                    }
                    //Fin nombre

                    //Apellido
                    System.out.println("Digite el apellido de la persona: ");
                    Apellido = scan.nextLine();

                    retorno_vac = HelperValidacion.ValidarVacio(Apellido);
                    while (retorno_vac) {
                        System.out.println("Digite el apellido de la persona: ");
                        Apellido = scan.nextLine();
                        retorno_vac = HelperValidacion.ValidarVacio(Apellido);
                    }

                    retorno_vac = HelperValidacion.ValidarVacio(Apellido);
                    retorno_num = HelperValidacion.RetornaValor(Apellido);
                    retorno_ce = HelperValidacion.RetornarValorCE(Apellido);

                    while (retorno_num != 0 || retorno_ce != 0 || retorno_vac == true) {
                        System.out.println("Digite el apellido de la persona: ");
                        Apellido = scan.nextLine();

                        retorno_vac = HelperValidacion.ValidarVacio(Apellido);
                        retorno_num = HelperValidacion.RetornaValor(Apellido);
                        retorno_ce = HelperValidacion.RetornarValorCE(Apellido);
                    }
                    //Fin apellido

                    //Cedula
                    System.out.println("Digite el numero de cedula de la persona: ");
                    Cedula = scan.nextLine();

                    retorno_vac = HelperValidacion.ValidarVacio(Cedula);
                    while (retorno_vac) {
                        System.out.println("Digite el numero de cedula de la persona: ");
                        Cedula = scan.nextLine();
                        retorno_vac = HelperValidacion.ValidarVacio(Cedula);
                    }

                    retorno_vac = HelperValidacion.ValidarVacio(Cedula);
                    retorno_letra = HelperValidacion.RetornarValorLetra(Cedula);
                    retorno_ce = HelperValidacion.RetornarValorCE(Cedula);
                    retorno_ced = Persona.VerificarCedula(Lista_personas, Cedula);

                    while (retorno_letra != 0 || retorno_ce != 0 || retorno_ced != 0 || retorno_vac == true) {
                        if (retorno_ced != 0) {
                            System.out.println("El numero de cedula ingresado ya se encuentra registrado");
                        }

                        System.out.println("Digite el numero de cedula de la persona: ");
                        Cedula = scan.nextLine();

                        retorno_vac = HelperValidacion.ValidarVacio(Cedula);
                        retorno_letra = HelperValidacion.RetornarValorLetra(Cedula);
                        retorno_ce = HelperValidacion.RetornarValorCE(Cedula);
                        retorno_ced = Persona.VerificarCedula(Lista_personas, Cedula);
                    }
                    //Fin cedula

                    //Direccion
                    System.out.println("Digite la direccion de la persona: ");
                    Direccion = scan.nextLine();

                    retorno_vac = HelperValidacion.ValidarVacio(Direccion);
                    while (retorno_vac) {
                        System.out.println("Digite la direccion de la persona: ");
                        Direccion = scan.nextLine();
                        retorno_vac = HelperValidacion.ValidarVacio(Direccion);
                    }

                    retorno_vac = HelperValidacion.ValidarVacio(Direccion);
                    retorno_ce2 = HelperValidacion.RetornarValorCE2(Direccion);

                    while (retorno_ce2 != 0 || retorno_vac == true) {
                        System.out.println("Digite la direccion de la persona: ");
                        Direccion = scan.nextLine();

                        retorno_ce2 = HelperValidacion.RetornarValorCE2(Direccion);
                        retorno_vac = HelperValidacion.ValidarVacio(Direccion);
                    }
                    //Fin direccion

                    //Cantidad de computadores
                    ArrayList<Computador> computadores = new ArrayList<>();

                    do {
                        try {
                            System.out.println("Numero de computadores que se desea añadirle: ");
                            Num_comp = scan.nextInt();
                            scan.nextLine();
                            
                        } catch (InputMismatchException e) {
                            System.out.println("Error");
                        }
                        scan.nextLine();
                    } while (Num_comp <= 0);

                    retorno_can = HelperValidacion.ValidarCantidadRango(Num_comp);

                    //Creacion de la lista de computadores
                    if (retorno_can == 1) {
                        for (int i = 0; i < Num_comp; i++) {

                            //Marca
                            System.out.println("Digite la marca del computador " + (i + 1) + " :");
                            Marca = scan.nextLine();

                            retorno_vac = HelperValidacion.ValidarVacio(Marca);
                            while (retorno_vac) {
                                System.out.println("Digite la marca del computador " + (i + 1) + " :");
                                Marca = scan.nextLine();
                                retorno_vac = HelperValidacion.ValidarVacio(Marca);
                            }

                            retorno_vac = HelperValidacion.ValidarVacio(Marca);
                            retorno_num = HelperValidacion.RetornaValor(Marca);
                            retorno_ce = HelperValidacion.RetornarValorCE(Marca);

                            while (retorno_num != 0 || retorno_ce != 0 || retorno_vac == true) {
                                System.out.println("Digite la marca del computador " + (i + 1) + " :");
                                Marca = scan.nextLine();

                                retorno_vac = HelperValidacion.ValidarVacio(Marca);
                                retorno_num = HelperValidacion.RetornaValor(Marca);
                                retorno_ce = HelperValidacion.RetornarValorCE(Marca);
                            }
                            //fin marca

                            //Serial
                            System.out.println("Digite el serial del computador " + (i + 1) + " :");
                            Serial = scan.nextLine();

                            retorno_vac = HelperValidacion.ValidarVacio(Serial);
                            while (retorno_vac) {
                                System.out.println("Digite el serial del computador " + (i + 1) + " :");
                                Serial = scan.nextLine();
                                retorno_vac = HelperValidacion.ValidarVacio(Serial);
                            }

                            retorno_vac = HelperValidacion.ValidarVacio(Serial);
                            retorno_ce = HelperValidacion.RetornarValorCE(Serial);

                            while (retorno_vac == true || retorno_ce != 0) {
                                System.out.println("Digite el serial del computador " + (i + 1) + " :");
                                Serial = scan.nextLine();

                                retorno_vac = HelperValidacion.ValidarVacio(Serial);
                                retorno_ce = HelperValidacion.RetornarValorCE(Serial);
                            }
                            //Fin serial

                            //Tamaño
                            System.out.println("Digite el tamaño del computador " + (i + 1) + " : " + "(Grande, Mediano o Pequeño)");
                            Tamaño = scan.nextLine();

                            retorno_vac = HelperValidacion.ValidarVacio(Tamaño);
                            while (retorno_vac) {
                                System.out.println("Digite el tamaño del computador " + (i + 1) + " :" + "(Grande, Mediano o Pequeño)");
                                Tamaño = scan.nextLine();
                                retorno_vac = HelperValidacion.ValidarVacio(Tamaño);
                            }

                            retorno_vac = HelperValidacion.ValidarVacio(Tamaño);
                            retorno_num = HelperValidacion.RetornaValor(Tamaño);
                            retorno_ce = HelperValidacion.RetornarValorCE(Tamaño);

                            while (retorno_num != 0 || retorno_ce != 0 || retorno_vac == true) {
                                System.out.println("Digite el tamaño del computador " + (i + 1) + " : " + "(Grande, Mediano o Pequeño)");
                                Tamaño = scan.nextLine();

                                retorno_vac = HelperValidacion.ValidarVacio(Tamaño);
                                retorno_num = HelperValidacion.RetornaValor(Tamaño);
                                retorno_ce = HelperValidacion.RetornarValorCE(Tamaño);
                            }
                            //Fin tamaño

                            System.out.println("Digite el color del computador " + (i + 1) + " :");
                            Color = scan.nextLine();

                            retorno_vac = HelperValidacion.ValidarVacio(Color);
                            while (retorno_vac) {
                                System.out.println("Digite el color del computador " + (i + 1) + " :");
                                Color = scan.nextLine();
                                retorno_vac = HelperValidacion.ValidarVacio(Color);
                            }

                            retorno_vac = HelperValidacion.ValidarVacio(Color);
                            retorno_num = HelperValidacion.RetornaValor(Color);
                            retorno_ce = HelperValidacion.RetornarValorCE(Color);

                            while (retorno_num != 0 || retorno_ce != 0 || retorno_vac == true) {
                                System.out.println("Digite el color del computador " + (i + 1) + " :");
                                Color = scan.nextLine();

                                retorno_vac = HelperValidacion.ValidarVacio(Color);
                                retorno_num = HelperValidacion.RetornaValor(Color);
                                retorno_ce = HelperValidacion.RetornarValorCE(Color);
                            }
                            //Fin color

                            //creacion del objeto computador
                            Computador objcomputador = new Computador(Marca, Serial, Tamaño, Color);
                            computadores.add(objcomputador);

                        }
                        Lista_global = computadores;
                        computadores = null;
                    } else {
                        System.out.println("Cantidad invalida");
                        break;
                    }

                    //creacion del objeto persona
                    Persona objpersona = new Persona(Nombre, Apellido, Cedula, Direccion);

                    //cear asociacion
                    objpersona.setComputadores(Lista_global);
                    Lista_personas.add(objpersona);
                    break;

                case 2:
                    scan.nextLine();
                    System.out.println("Digite la cedula de la persona que desea buscar: ");
                    Ce_buscar = scan.nextLine();
                    if (!Lista_personas.isEmpty()) {
                        HelperImpresion.ImprimirPersonaBuscada(Lista_personas, Ce_buscar);
                    } else {
                        System.out.println("La lista de personas no esta llena");
                    }
                    break;

                case 3:
                    if (!Lista_personas.isEmpty()) {
                        HelperImpresion.ImprimirPersona(Lista_personas);
                    } else {
                        System.out.println("La lista esta vacia.");
                    }
                    break;

                case 4:
                    //salir
                    break;

                default:
                    System.out.println("Opcion no valida para el menu");
            }

        } while (opc != 4);
    }

}
