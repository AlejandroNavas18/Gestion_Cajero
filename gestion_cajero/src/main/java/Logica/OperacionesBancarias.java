package Logica;

import Excepciones.SaldoNoValidoException;
import Modelo.Pojos.Tarjeta;

public class OperacionesBancarias {


    public double consultarSaldo(Tarjeta tarjeta){
        return tarjeta.getSaldo();
    }

    public void retirarEfectivo(int cantidad, Tarjeta tarjeta) throws SaldoNoValidoException{
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a retirar debe ser mayor que cero.");
        }
        if (tarjeta.getSaldo() < cantidad) {
            throw new SaldoNoValidoException( "Saldo insuficiente");
        }
        double nuevoSaldo = tarjeta.getSaldo() - cantidad;
        tarjeta.setSaldo(nuevoSaldo);
        System.out.println("Retiro exitoso. Nuevo saldo: " + nuevoSaldo);
    }

    public void ingresarEfectivo(int cantidad, Tarjeta tarjeta){
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a ingresar debe ser mayor que cero.");
        }
        if (tarjeta == null) {
            throw new IllegalArgumentException("Tarjeta no válida.");
        }
        double nuevoSaldo = tarjeta.getSaldo() + cantidad;
        tarjeta.setSaldo(nuevoSaldo);
        System.out.println("Ingreso exitoso. Nuevo saldo: " + nuevoSaldo);
    }
}
