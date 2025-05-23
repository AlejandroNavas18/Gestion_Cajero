package Modelo.Pojos;

public class Tarjeta {
    private int numTarjeta;
    private int clave;
    private double saldo;

    public Tarjeta(int numTarjeta, int clave, double saldo) {
        this.numTarjeta = numTarjeta;
        this.clave = clave;
        this.saldo=saldo;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


   
}
