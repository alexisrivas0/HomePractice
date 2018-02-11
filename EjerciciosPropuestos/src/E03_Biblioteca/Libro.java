package E03_Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Libro extends AbstractPublicaciones{

    private String edicion;
    private String ISBN;
    private String autor;
    private boolean prestado =  false;



    public Libro(){
        super();
    }


    public Libro(String nombre, String fecha, String edicion, String ISBN, String autor, boolean  prestado) {
        super(nombre, fecha);
        this.edicion = edicion;
        this.ISBN = ISBN;
        this.autor = autor;
        this.prestado = prestado;
    }



    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getFecha() {
        return super.getFecha();
    }

    @Override
    public void setFecha(String fecha) {
        super.setFecha(fecha);
    }

    @Override
    public boolean esPrestado() {
        if (prestado =  true){
            System.out.println("El libro esta prestado");
        }else{
            System.out.println("El libro esta disponible");
        }
        return prestado;
    }

    @Override
    public void cambiarEstado() {

        if (prestado = false){
            setPrestado(true);}
            else{setPrestado(false);}
    }


}
