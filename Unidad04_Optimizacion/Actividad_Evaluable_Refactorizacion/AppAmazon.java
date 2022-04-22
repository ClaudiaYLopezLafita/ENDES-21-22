package com.company.ActividadEntregable;

import java.util.Iterator;
import java.util.Scanner;
/*
los metodos obtenerMedia, obtenerMayor, obtenerMenor y solicitarImporte son privados dado que seran
invocados en calculo() y no es oportuno, en este caso, desde el main.

Los atributos mediaPagos, pagoMayor y pagoMenor se podrían obviar dado que sus valores son calculaods.
Por ello los elimino junto con su getter y setter.
 */
public class AppAmazon{

    private double[] HistoricoPagos; //array donde se guarda el histórico de los pagos realizados

    public AppAmazon () {
        HistoricoPagos = new double[5]; //el máximo de pagos que se van a guardar en esta clase es de 5
    }

    public void calculos() {

        solicitarImporte();

        Consola.mostrarPantalla("La media es: "+ obtenerMedia());
        Consola.mostrarPantalla("El pago más bajo que se ha realizado es de: " + obtenerMayor());
        Consola.mostrarPantalla("El pago más bajo que se ha realizado es de: " + obtenerMenor());

    }

    //dado que se va a repetir la misma accion. Usamos getHistoricoPagos().length por si se
    // cambia su valor en un futuro
    private void solicitarImporte(){
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < getHistoricoPagos().length; i++) {
            Consola.mostrarPantalla("Introduce el importe del pedido nº" + (i+1));
            HistoricoPagos[i] = Consola.solicitarNumero(teclado);
        }
    }

    private double obtenerMedia(){
        double media = 0;
        for (int i = 0; i < 5; i++) {
            media += HistoricoPagos[i];
        }
        media = media / 5;

        return media;
    }

    private double obtenerMayor(){
        double mayor = HistoricoPagos[0];

        for (int i = 1; i < getHistoricoPagos().length-1; i++) {
            if (HistoricoPagos[i]>mayor){
                mayor=HistoricoPagos[i];
            }
        }
        return mayor;
    }

    private double obtenerMenor(){
        double menor = HistoricoPagos[0];

        for (int i = 1; i < getHistoricoPagos().length-1; i++) {
            if (HistoricoPagos[i] < menor) {
                menor = HistoricoPagos[i];
            }
        }
        return menor;
    }

    public AppAmazon (int numMaxPedidos) {
        HistoricoPagos = new double[numMaxPedidos];
    }

    public double[] getHistoricoPagos() {
        return HistoricoPagos;
    }

    public void setHistoricoPagos(double[] historicoPagos) {
        HistoricoPagos = historicoPagos;
    }

}
