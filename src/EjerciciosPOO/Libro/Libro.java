package EjerciciosPOO.Libro;

public class Libro {

    //Atributos

    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;


    //Constructor por defecto

    public Libro() {}

    //Constructor con parametros

    public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados){

        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    //Metodos Getters y Setters

    public void setTituto(String titulo){

        this.titulo=titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }

    public String getAutor(){

        return autor;
    }

    public void setNumeroEjemplares(int numeroEjemplares){
        this.numeroEjemplares=numeroEjemplares;
    }
    public int getNumeroEjemplares(){
        return getNumeroEjemplares();
    }
    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados){
        this.numeroEjemplaresPrestados=numeroEjemplaresPrestados;
    }
    public int getNumeroEjemplaresPrestados(){

        return numeroEjemplaresPrestados;
    }

    public boolean prestamo(){

        boolean prestado = true;

        if (numeroEjemplaresPrestados<numeroEjemplares){
            numeroEjemplaresPrestados++;
        }else{
            prestado =false;
        } return prestado;
        }

    public boolean devolucion(){

        boolean devuelto = true;

        if (numeroEjemplaresPrestados == 0){
            devuelto = false;
        } else {
            numeroEjemplaresPrestados--;
        }
        return devuelto;

    }

    public String toString() {
        return "titulo: " + titulo + "nombre autor: " + autor +
                " numero de ejemplares: " + numeroEjemplares + "numeros prestados: " + numeroEjemplaresPrestados;
    }
}
