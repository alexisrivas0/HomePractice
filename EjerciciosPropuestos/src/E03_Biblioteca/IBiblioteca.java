package E03_Biblioteca;

public interface IBiblioteca {

    /*
    Enseña el menu para ejecutar la aplicación
     */
    void showMenu();
    /*
    Declara asigna los metodos del menu a los seleccionados por el usuario
     */
    void controles(int opcion);
    /*
    Enseña la unidades de libros prestados (*¿Enseñara tambien discos?* por definir)
     */
    void unidadesPrestadas();

    /*
    Realiza un prestamo de un articulo
     */
    void prestamo();
    /*
    retorna al stock un articulo
     */
    void devolucion();
    /*
    Muestra todos los articulor publicados antes de una fecha seleccionada por el usuario
     */
    void publicacionesAnterioresA();
    /*
    Muestra todas las publicaciones y discos disponibles
     */
    void publicacionesYDiscos();
    /*
    Muestras las publicaciones y los discos separados por "Prestados" o "Disponibles"
     */
    void publicacionesYDiscosSN();

}
