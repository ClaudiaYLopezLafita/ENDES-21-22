package com.company.PruebaCalculadora;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith (Parameterized.class)
public class CalculadoraTestSuma {
    private int nume1;
    private int nume2;
    private int resul;

    public CalculadoraTestSuma(int nume1, int nume2, int resul) {
        this.nume1 = nume1;
        this.nume2 = nume2;
        this.resul = resul; //resultado de la operación
    }

    @Parameterized.Parameters
    public static Collection<Object[]> numeros() {
        return Arrays.asList(new Object[][] {
                { 20, 10, 2}, {30, -2, -15 }, {5, 2, 3}
        });
    }

    @Test
    public void testSuma() {
        Calculadora calcu = new Calculadora(nume1, nume2);
        int resultado = calcu.suma();
        assertEquals(resul, resultado);
    }

}