package com.gestion_cajero;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import Excepciones.SaldoNoValidoException;
import Logica.OperacionesBancarias;
import Modelo.Pojos.Tarjeta;

public class OperacionesBancariasTest {
 @Test
    public void testRetirarEfectivo_SaldoInsuficiente() {
        OperacionesBancarias operaciones = new OperacionesBancarias();
        Tarjeta tarjeta = new Tarjeta(123456, 1234, 100.0);

        SaldoNoValidoException ex = assertThrows(SaldoNoValidoException.class, () -> {
            operaciones.retirarEfectivo(200, tarjeta);
        });

        assertEquals("Saldo insuficiente", ex.getMessage());
    }

    @Test
    public void testIngresarEfectivo_Correcto() {
        OperacionesBancarias operaciones = new OperacionesBancarias();
        Tarjeta tarjeta = new Tarjeta(654321, 4321, 300.0);

        operaciones.ingresarEfectivo(200, tarjeta);

        assertEquals(500.0, tarjeta.getSaldo());
    }
}
