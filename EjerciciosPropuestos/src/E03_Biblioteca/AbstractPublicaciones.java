package E03_Biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class AbstractPublicaciones implements IBiblioteca {

    String nombre;
    String fecha;
    int unidadesTotales;
    int unidadesPrestadas;
    int unidadesDisponibles;
    int opcion;


    public AbstractPublicaciones() {}

    public AbstractPublicaciones(String nombre, String fecha, int unidadesTotales, int unidadesPrestadas, int unidadesDisponibles) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.unidadesTotales = unidadesTotales;
        this.unidadesPrestadas = unidadesPrestadas;
        this.unidadesDisponibles = unidadesDisponibles;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getUnidadesTotales() {
        return unidadesTotales;
    }

    public void setUnidadesTotales(int unidadesTotales) {
        this.unidadesTotales = unidadesTotales;
    }

    public int getUnidadesPrestadas() {
        return unidadesPrestadas;
    }

    public void setUnidadesPrestadas(int unidadesPrestadas) {
        this.unidadesPrestadas = unidadesPrestadas;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }



}
