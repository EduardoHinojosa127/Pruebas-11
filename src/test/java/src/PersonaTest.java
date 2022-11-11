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
public class PersonaTest {
    
    @Test
    public void test3(){
        Persona p = new Persona(18);
        assertFalse(p.isMayorEdad());
    }
    @Test
    public void test4(){
        Persona p = new Persona(17);
        assertFalse(p.isMayorEdad());
    }
    
    @Test
    public void test5(){
        Persona p = new Persona(18);
        assertTrue(p.isMayorEdad());
    }
    
    @Test
    public void test6(){
        Persona p = new Persona(100);
        assertTrue(p.isMayorEdad());
    }
    
    /*@Test
    public void test1(){
        Persona p = new Persona(-1);
        p.isMayorEdad();
    }
    @Test
    public void test2(){
        Persona p = new Persona(-100);
        p.isMayorEdad();
    }*/
}
