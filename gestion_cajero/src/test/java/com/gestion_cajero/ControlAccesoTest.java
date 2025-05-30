package com.gestion_cajero;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import Logica.ControlAcceso;
import Modelo.Pojos.Tarjeta;

public class ControlAccesoTest {
  @Test
    public void testVerificarTarjeta_Valida() {
        ControlAcceso control = new ControlAcceso();
        boolean resultado = control.verificarTarjeta(123456, 1234);
        assertTrue(resultado, "La tarjeta debería ser válida");
    }

    @Test
    public void testObtenerTarjetaVerificada_NoValida() {
        ControlAcceso control = new ControlAcceso();
        Tarjeta tarjeta = control.obtenerTarjetaVerificada(999999, 9999);
        assertNull(tarjeta, "La tarjeta no debería existir");
    }
}
