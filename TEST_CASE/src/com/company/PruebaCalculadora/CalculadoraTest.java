package com.company.PruebaCalculadora;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void testSuma()  {
        Calculadora calcu = new Calculadora(20, 10);
        int resultado = calcu.suma();
        assertEquals(30, resultado);
    }

    @Test
    public void testResta() {
        //fail("Not yet implemented");
        Calculadora calcu = new Calculadora(20, 10);
        int resultado = calcu.resta();
        assertEquals(10, resultado);
    }

    @Test
    public void testMultiplica() {
        //fail("Not yet implemented");
        Calculadora calcu = new Calculadora(20, 10);
        int resultado = calcu.multiplica();
        assertEquals(200, resultado);
    }

    @Test
    public void testDivide() {
        //fail("Not yet implemented");
        Calculadora calcu = new Calculadora(20, 10);
        int resultado = calcu.divide();
        assertEquals(2, resultado);
    }
}