package com.SubMatriz;

import java.util.Arrays;
import java.util.Scanner;

public class EjSubMatriz {
    public static void main(String[] args) {
        int[][] numeros;
        Scanner sc = new Scanner(System.in);
        int tam;

        System.out.println("Dime el tamaño del vector");
        tam = sc.nextInt();

       /* numeros = new int[tam][tam];

        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int) (Math.random()*101);
            }
        }*/

        numeros = fabricaArrayBidimencional(tam);

        for(int[] fila:numeros) {
            System.out.println(Arrays.toString(fila));
        }

       /* int fila,columna;
        System.out.println("Introduce la fila");
        fila = sc.nextInt();
        System.out.println("Introduce la columna");
        columna = sc.nextInt();
        System.out.println("Introduce el tamaño de la submatriz");
        tam = sc.nextInt();

        System.out.println(Arrays.deepToString(submatriz(numeros,fila,columna,tam)));*/

    }

    public static int[][] submatriz(int[][] origen, int fila, int columna, int tam) {

        int[][] resultado ={};
        if (fila<0 || fila >= origen.length || columna<0 || columna>= origen[0].length ||
                fila+(tam-1) >= origen.length || columna+ (tam-1)>= origen[0].length) {
            System.out.println("Imposible obtener esa submatriz");
            return resultado;
        } else {
            resultado = new int[tam][tam];
            for (int i = fila; i < fila+tam; i++) {
                for (int j = columna; j < columna+tam ; j++) {
                    resultado[i-fila][j-columna] = origen[i][j];
                }
            }
            return resultado;
        }
    }

    public  static int[][] fabricaArrayBidimencional (int numElemento){
        int[][] numeros;

        numeros = new int[numElemento][numElemento];
        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int) (Math.random()*101);
            }
        }

        return numeros;
    }
}
