/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package src;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class BibliotecariaTest {
    
    @Test
    public void test1(){
        Bibliotecaria b = new Bibliotecaria("00000", 100000, 0000, "00000","General");
        assertTrue(b.validarCod_lib());
        assertTrue(b.validarCod_user());
        assertTrue(b.validarCod_plan());
        assertTrue(b.validarContraseña());
        assertTrue(b.validarTipo_prestamo());
    }
    @Test
    public void test2(){
        Bibliotecaria b = new Bibliotecaria("zzzzz", 999999, 9999, "zzzzz","Reserva");
        assertTrue(b.validarCod_lib());
        assertTrue(b.validarCod_user());
        assertTrue(b.validarCod_plan());
        assertTrue(b.validarContraseña());
        assertTrue(b.validarTipo_prestamo());
    }
    
    @Test
    public void test3(){
        Bibliotecaria b = new Bibliotecaria("Aaaa", 100001, 0001, "Aaaaa","General");
        assertTrue(b.validarCod_lib());
        assertTrue(b.validarCod_user());
        assertTrue(b.validarCod_plan());
        assertTrue(b.validarContraseña());
        assertTrue(b.validarTipo_prestamo());
    }
    
    @Test
    public void test4(){
        Bibliotecaria b = new Bibliotecaria("999999", 999998, 9998, "99999","Reserva");
        assertTrue(b.validarCod_lib());
        assertTrue(b.validarCod_user());
        assertTrue(b.validarCod_plan());
        assertTrue(b.validarContraseña());
        assertTrue(b.validarTipo_prestamo());
    }
    
    @Test
    public void test5(){
        Bibliotecaria b = new Bibliotecaria("1aaa1", 99999, 0000, "z999z","General");
        assertTrue(b.validarCod_lib());
        assertTrue(b.validarCod_user());
        assertTrue(b.validarCod_plan());
        assertTrue(b.validarContraseña());
        assertTrue(b.validarTipo_prestamo());
    }
    
    @Test
    public void test6(){
        Bibliotecaria b = new Bibliotecaria("a111a", 1000000, 9999, "9zzz9","Reserva");
        assertTrue(b.validarCod_lib());
        assertTrue(b.validarCod_user());
        assertTrue(b.validarCod_plan());
        assertTrue(b.validarContraseña());
        assertTrue(b.validarTipo_prestamo());
    }
    
    @Test
    public void test7(){
        Bibliotecaria b = new Bibliotecaria("d1ad8", 555555, 000, "5d7x4","General");
        assertTrue(b.validarCod_lib());
        assertTrue(b.validarCod_user());
        assertTrue(b.validarCod_plan());
        assertTrue(b.validarContraseña());
        assertTrue(b.validarTipo_prestamo());
    }
    
    public void test8(){
        Bibliotecaria b = new Bibliotecaria("e55sq", 777777, 10000, "00000","Reserva");
        assertTrue(b.validarCod_lib());
        assertTrue(b.validarCod_user());
        assertTrue(b.validarCod_plan());
        assertTrue(b.validarContraseña());
        assertTrue(b.validarTipo_prestamo());
    }
}
