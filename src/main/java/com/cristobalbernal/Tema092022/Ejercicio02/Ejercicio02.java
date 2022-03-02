package com.cristobalbernal.Tema092022.Ejercicio02;

import com.cristobalbernal.Tema092022.Lib.Lib;

public class Ejercicio02 {
    public void execute(){
        int numeroIntroducidos = 10;
        double [] numeros = new double[numeroIntroducidos];
        double numero;
        int contador = 0;

        for (int i = 0; i <numeroIntroducidos; i++) {

            System.out.println("Escribe el numero " + (i +1));
            numero = Lib.leerDouble();

        }
        double mayor = numeros[0];
        for (double v : numeros) {
            if (v > mayor) {
                mayor = v;
            }
        }
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero de excepciones saltadas : " + contador);
    }
}
