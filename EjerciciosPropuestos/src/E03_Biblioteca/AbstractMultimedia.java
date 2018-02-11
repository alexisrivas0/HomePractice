package E03_Biblioteca;

import E03_Biblioteca.Enums.EnumFormato;

public abstract class AbstractMultimedia implements IBiblioteca{

    private String titulo;
    private EnumFormato formato;
    private double duraccion;

    public AbstractMultimedia() {}

    public AbstractMultimedia(String titulo, EnumFormato formato, double duraccion) {
        this.titulo = titulo;
        this.formato = formato;
        this.duraccion = duraccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public EnumFormato getFormato() {
        return formato;
    }

    public void setFormato(EnumFormato formato) {
        this.formato = formato;
    }

    public double getDuraccion() {
        return duraccion;
    }

    public void setDuraccion(double duraccion) {
        this.duraccion = duraccion;
    }
}
