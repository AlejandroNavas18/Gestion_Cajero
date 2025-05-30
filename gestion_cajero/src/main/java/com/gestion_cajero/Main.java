package com.gestion_cajero;

import Excepciones.SaldoNoValidoException;
import Excepciones.TarjetaIncorrectaException;
import Vista.Cajero;

public class Main {
    private Cajero cajero;

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        cajero = new Cajero();
        try {
            cajero.menu();
        } catch (TarjetaIncorrectaException e) {
            System.out.println("Por seguridad, el programa se cerrará.");
            System.exit(0); // Fin del programa
        } catch (SaldoNoValidoException e) {
        }
    }
}