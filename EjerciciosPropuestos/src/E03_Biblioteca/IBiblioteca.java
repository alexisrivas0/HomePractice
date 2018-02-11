package E03_Biblioteca;

public interface IBiblioteca {

    /*
     * Metodo que te dice si un elemento esta o no prestado.
     */

    boolean esPrestado();

    /*
     * Metodo que cambia el estado de un elemento de prestado a no prestado.
     */

    void cambiarEstado();
}
