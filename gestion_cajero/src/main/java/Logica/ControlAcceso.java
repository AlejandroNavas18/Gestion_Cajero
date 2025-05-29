package Logica;

import java.util.ArrayList;
import Modelo.Pojos.Tarjeta;

public class ControlAcceso {
    private ArrayList<Tarjeta> tarjetas = new ArrayList<>();

    public ControlAcceso() {
        // Inicializar con algunas tarjetas de ejemplo
        tarjetas.add(new Tarjeta(123456, 1234, 1000.0));
        tarjetas.add(new Tarjeta(654321, 4321, 500.0));
        tarjetas.add(new Tarjeta(111222, 1111, 750.0));
    }

    public boolean verificarTarjeta(int numTarjeta, int clave) {
        boolean tarjetaCorrecta = false;
        for (Tarjeta tarjeta : tarjetas) {
            if (tarjeta.getNumTarjeta() == numTarjeta && tarjeta.getClave() == clave) {
                return tarjetaCorrecta = true; 
            }
        }

        return tarjetaCorrecta;
    }

    public void agregarTarjeta(Tarjeta tarjeta) {
        tarjetas.add(tarjeta);
    }
    
    public Tarjeta obtenerTarjetaVerificada(int numero, int clave) {
        for (Tarjeta tarjeta : tarjetas) {
            if (tarjeta.getNumTarjeta() == numero && tarjeta.getClave() == clave) {
                return tarjeta; // Tarjeta válida
            }
        }
        return null; // No encontrada o clave incorrecta
    }
    
}
