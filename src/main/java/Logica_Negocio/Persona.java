/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author jsml
 */
public class Persona {
    //declaracion de atributos

    public String Nombre;
    public String Apellido;
    public String Cedula;
    public String Direccion;
    public ArrayList<Computador> computadores;

    //Constructor no parametrizado
    public Persona() {
    }

    //Constructor parametrizado
    public Persona(String Nombre, String Apellido, String Cedula, String Direccion) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Direccion = Direccion;
    }

    //setters
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    //getters
    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getDireccion() {
        return Direccion;
    }

    public ArrayList<Computador> getComputadores() {
        return computadores;
    }

    public void setComputadores(ArrayList<Computador> computadores) {
        this.computadores = computadores;
    }

    //verificar cedula
    public static int VerificarCedula(ArrayList<Persona> listaPersonas, String Cedula) {
        for (int i = 0; i < listaPersonas.size(); i++) {
            if (listaPersonas.get(i).getCedula().equals(Cedula)) {
                
                return 1;
            }
        }

        return 0;
    }

}
