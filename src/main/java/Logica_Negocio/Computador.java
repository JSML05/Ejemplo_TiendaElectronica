/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author jsml
 */
public class Computador {
    //Declaracion de atributos
    public String Marca;
    public String Serial;
    public String Tamaño;
    public String Color;
    
    //constructor no parametrizado

    public Computador() {
    }
    
    //constructor parametrizado

    public Computador(String Marca, String Serial, String Tamaño, String Color) {
        this.Marca = Marca;
        this.Serial = Serial;
        this.Tamaño = Tamaño;
        this.Color = Color;
    }
    
    //setters

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setSerial(String Serial) {
        this.Serial = Serial;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
    //getters

    public String getMarca() {
        return Marca;
    }

    public String getSerial() {
        return Serial;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public String getColor() {
        return Color;
    }
    

}
