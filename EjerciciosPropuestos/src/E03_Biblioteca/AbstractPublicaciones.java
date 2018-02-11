package E03_Biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class AbstractPublicaciones implements IBiblioteca {

    String nombre;
    String fecha;



    public AbstractPublicaciones() {}

    public AbstractPublicaciones(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
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
}
