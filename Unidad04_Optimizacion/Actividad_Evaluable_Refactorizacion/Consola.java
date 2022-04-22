package com.company.ActividadEntregable;

import java.util.Scanner;

public class Consola {
    // dado que estamos pidiendo por pantalla varias veces y para casos futuros
    public static void mostrarPantalla(String cadena) {
        System.out.println(cadena);
    }

    // para verificara la correcta introduccion de un valor numerico por teclado
    public static double solicitarNumero(Scanner teclado) {
        boolean excepcion = false;
        double num = 0;

        do {
            try {
                num = teclado.nextDouble();
            } catch (Exception e) {
                excepcion = true;
            }
        } while (excepcion);

        return num;
    }
}
