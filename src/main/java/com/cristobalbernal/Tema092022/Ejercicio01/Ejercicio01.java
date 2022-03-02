package com.cristobalbernal.Tema092022.Ejercicio01;

import com.cristobalbernal.Tema092022.Lib.Lib;

public class Ejercicio01 {
    public void execute(){
        int numero;
        boolean valid = false;
        try {
            do {
                System.out.println("Escribe solo numeros");
                numero = Lib.leerInt();
                valid = numero >= 0;
            }while (valid);
            System.out.println("Has introducido un numero negativo");
        }catch (NumberFormatException nfe){
            System.out.println("Error has escrito una letra");
        }

    }
}
