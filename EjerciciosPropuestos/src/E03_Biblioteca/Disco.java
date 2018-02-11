package E03_Biblioteca;

import E03_Biblioteca.Enums.EnumFormato;

public class Disco extends AbstractMultimedia{

    public Disco() {}

    public Disco(String titulo, EnumFormato formato, double duraccion, boolean prestado) {
        super(titulo, formato, duraccion);
        this.prestado = prestado;
    }


    boolean prestado;

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public void setTitulo(String titulo) {
        super.setTitulo(titulo);
    }

    @Override
    public EnumFormato getFormato() {
        return super.getFormato();
    }

    @Override
    public void setFormato(EnumFormato formato) {
        super.setFormato(formato);
    }

    @Override
    public double getDuraccion() {
        return super.getDuraccion();
    }

    @Override
    public void setDuraccion(double duraccion) {
        super.setDuraccion(duraccion);
    }

    @Override
    public boolean esPrestado() {
        return prestado;
    }

    @Override
    public void cambiarEstado() {

    }

    @Override
    public String named() {
        return super.getTitulo();
    }
}
