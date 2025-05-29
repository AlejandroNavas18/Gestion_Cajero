package Modelo.Dao;

import Logica.ControlAcceso;
import Modelo.Pojos.Tarjeta;

public class DaoCliente {
    ControlAcceso controlAcceso;

    public DaoCliente() {
    }

    public void insertarTarjeta(int numTarjeta, int clave, double saldo) {
        Tarjeta tarjeta = new Tarjeta(numTarjeta, clave, saldo);
        controlAcceso.agregarTarjeta(tarjeta);

    }

    
}
