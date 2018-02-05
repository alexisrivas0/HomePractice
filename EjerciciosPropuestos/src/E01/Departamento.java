package E01;

import java.util.ArrayList;

public class Departamento {

    private String nombre;
    private String ubicacion;
    private String telefono;
    private Empleado director;
    ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public Departamento() {}

    public Departamento(String nombre, String ubicacion, String telefono, Empleado director) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.director = director;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }


    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", director=" + director +
                '}';
    }
}
