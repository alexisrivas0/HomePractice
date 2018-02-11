package E03_Biblioteca;

public class Revista extends AbstractPublicaciones{

    private int numero;
    private String periocidad;
    private boolean prestado;

    public Revista() {
        super();
    }

    public Revista(String nombre, String fecha, int numero, String periocidad, boolean prestado) {
        super(nombre, fecha);
        this.numero = numero;
        this.periocidad = periocidad;
        this.prestado = prestado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPeriocidad() {
        return periocidad;
    }

    public void setPeriocidad(String periocidad) {
        this.periocidad = periocidad;
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

    public String getFecha() {
        return fecha;
    }

    @Override
    public void setFecha(String fecha) {
        super.setFecha(fecha);
    }
    @Override
    public boolean esPrestado() {

        return prestado;
    }

    @Override
    public void cambiarEstado() {


        if (prestado = false){
            setPrestado(true);}
        else{setPrestado(false);}
    }

    @Override
    public String named() {
        return this.nombre;
    }
}
