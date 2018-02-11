package E03_Biblioteca;

public class Comic extends  AbstractPublicaciones{

    private int numero;
    private String coleccion;
    private boolean prestado = false;

    public Comic(){
        super();
    }

    public Comic(String nombre, String fecha, int numero, String coleccion, boolean prestado) {
        super(nombre, fecha);
        this.numero = numero;
        this.coleccion = coleccion;
        this.prestado = prestado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    public Comic(String nombre, String fecha) {
        super(nombre, fecha);
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
