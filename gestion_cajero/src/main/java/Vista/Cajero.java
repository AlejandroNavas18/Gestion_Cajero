package Vista;

import java.util.Scanner;

import Excepciones.SaldoNoValidoException;
import Excepciones.TarjetaIncorrectaException;
import Logica.ControlAcceso;
import Logica.OperacionesBancarias;
import Modelo.Pojos.Tarjeta;

public class Cajero {
    ControlAcceso controlAcceso = new ControlAcceso();
    OperacionesBancarias operacionesbancarias = new OperacionesBancarias();
    Tarjeta tarjeta;
    Scanner scanner = new Scanner(System.in);

    public Cajero() {

    }

    public void menu() throws TarjetaIncorrectaException, SaldoNoValidoException {
        System.out.println("Bienvenido al cajero automático, inserte su tarjeta");
        leerTarjeta();
        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Retirar dinero");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad a retirar:");
                    
                    try {
                        int cantidadRet = scanner.nextInt();  
                        operacionesbancarias.retirarEfectivo(cantidadRet, tarjeta);
                    } catch (SaldoNoValidoException e) {
                        System.out.println("Saldo insuficiente, no se puede realizar el retiro.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("La cantidad a retirar debe ser mayor que cero.");
                    }                
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a ingresar:");
                    int cantidadIng = scanner.nextInt();
                    operacionesbancarias.ingresarEfectivo(cantidadIng, tarjeta);
                    break;
                case 3:
                    System.out.println("Su saldo actual es: ");
                    System.out.println(Double.toString(operacionesbancarias.consultarSaldo(tarjeta)));
                    break;
                case 4:
                    System.out.println("Saliendo del cajero. ¡Gracias por usar nuestros servicios!");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
                    break;
            }
        } while (opcion != 4);

    }

    public void leerTarjeta() throws TarjetaIncorrectaException {
        int numTarjeta;
        int clave;
        int oportunidad = 0; // Número de intentos permitidos
        do {
            System.out.print("Ingrese el número de tarjeta: ");
            numTarjeta = scanner.nextInt();
            System.out.print("Ingrese la clave de la tarjeta: ");
            clave = scanner.nextInt();
            if (controlAcceso.verificarTarjeta(numTarjeta, clave)) {
                System.out.println("Tarjeta verificada correctamente.");
                tarjeta = controlAcceso.obtenerTarjetaVerificada(numTarjeta, clave);
                return; // Salir del bucle si la tarjeta es válida
            } else {
                oportunidad++;
                System.out.println("Tarjeta o clave incorrecta. Por favor, inténtelo de nuevo.");
            }
        } while (oportunidad < 3);

        throw new TarjetaIncorrectaException("Tarjeta incorrecta, se han agotado los intentos.");
    }

}
