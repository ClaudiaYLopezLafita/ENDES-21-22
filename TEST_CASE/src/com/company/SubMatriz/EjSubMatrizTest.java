package com.SubMatriz;

import org.junit.Test;

import static org.junit.Assert.*;

public class EjSubMatrizTest {

    /**
     * Comprube que el numero de filas que presenta el Array.
     */
    @Test
    public void fabricaArrayBidimencional() {
        //fail("Not yet implemented");

        int[][] numeros = EjSubMatriz.fabricaArrayBidimencional(3);
        assertEquals(numeros.length,3,0.01);
    }

    /**
     * numero de elemntos que tenemos en cada fila (3 elementos por fila)
     */
    @Test
    public void fabricaArrayBidimencional3() {
        //fail("Not yet implemented"); seria necesario la validadcion de todos los elmentos de las filas
        int[][] numeros = EjSubMatriz.fabricaArrayBidimencional(3);
        for (int i = 0; i < numeros.length; i++) {
            assertEquals(numeros[i].length, numeros.length ,0.01);
        }
        // en el assertEquals ponemos las referencias relativas para que cuando se cambie un valor
        // todo lo relacionado se cambie.
    }

    /**
     * Comprobar que los elementos se localiazan entre el rango de 0 - 100 ambos incluidos
     */
    @Test
    public void fabricaArrayBidimencional4() {
        //fail("Not yet implemented"); seria necesario la validadcion de todos los elmentos de las filas
        int[][] numeros = EjSubMatriz.fabricaArrayBidimencional(3);
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                assertTrue(numeros[i][j]>-1 && numeros[i][j]<101);
            }
        }
        // en el assertEquals ponemos las referencias relativas para que cuando se cambie un valor
        // todo lo relacionado se cambie.
    }



    /*
    REFACTORIZAR - seleccionar una realidad logica y que trbaajn de forma coesionada
    se pueden aglutinar muchos assertEqueal los cuales al fallar no se puede saber que elemento es el que falle
    por lo tanto es menjor tener 20 casuisticas para cada elemnto que se quiera testear.


     */
}