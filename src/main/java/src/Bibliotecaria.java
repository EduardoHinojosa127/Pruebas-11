/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Usuario
 */
public class Bibliotecaria {
    private String cod_lib, contraseña, tipo_prestamo;
    private int cod_user, cod_plan;

    public Bibliotecaria(String cod_lib,int cod_user, int cod_plan, String contraseña, String tipo_prestamo) {
        this.cod_lib = cod_lib;
        this.contraseña = contraseña;
        this.tipo_prestamo = tipo_prestamo;
        this.cod_user = cod_user;
        this.cod_plan = cod_plan;
    }
    public boolean validarCod_lib(){
        return cod_lib.length()==5;
    }
    public boolean validarCod_user(){
        return cod_user<=999999||cod_user>=100000;
    }
    public boolean validarCod_plan(){
        return cod_user<=9999||cod_user>=1000;
    }
    public boolean validarContraseña(){
        return cod_lib.length()==5;
    }
    public boolean validarTipo_prestamo(){
        return tipo_prestamo.equals("General")||tipo_prestamo.equals("Reserva");
    }
}
