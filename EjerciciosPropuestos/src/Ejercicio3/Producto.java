package Ejercicio3;

public class Producto {

    double precioSinIva;
    double precioConIva;

    public Producto(){}

    public Producto(double precioSinIva, double precioConIva) {
        this.precioSinIva = precioSinIva;
        this.precioConIva = precioConIva;
    }

    public double getPrecioSinIva() {
        return precioSinIva;
    }

    public void setPrecioSinIva(double precioSinIva) {
        this.precioSinIva = precioSinIva;
    }

    public double getPrecioConIva() {
        return precioConIva;
    }

    public void setPrecioConIva(double precioConIva) {
        this.precioConIva = precioConIva;
    }
}
