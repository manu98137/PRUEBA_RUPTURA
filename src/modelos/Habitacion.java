package modelos;

public abstract class Habitacion {
    protected int numero;
    protected double precioBase;
    protected double precioServicio;

    public Habitacion(int numero, double precioBase) {
        this.numero = numero;
        this.precioBase = precioBase;
    }

    public abstract void mostrarDetalles();

    public int getNumero() {
        return numero;
    }
}