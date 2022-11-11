/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Usuario
 */
public class Persona {
    private int edad;

    public Persona(int edad) {
        this.edad = edad;
    }
    public boolean isMayorEdad(){
        assert edad>=0;
        return edad>=18;
    }
}
