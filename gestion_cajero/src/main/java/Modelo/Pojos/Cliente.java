package Modelo.Pojos;

public class Cliente {
    private int id;
    private String nombre;
    private Tarjeta tarjeta;

    public Cliente() {
    }

    public Cliente(int id, String nombre, Tarjeta tarjeta) {
        this.id = id;
        this.nombre = nombre;
        this.tarjeta = tarjeta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }



}
