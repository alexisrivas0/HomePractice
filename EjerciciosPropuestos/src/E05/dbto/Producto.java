package E05.dbto;

import E05.enums.EnumCategorias;

public class Producto {

    private static String codigo;
    private String nombre;
    private EnumCategorias categoria;
    private int stock;
    private int codigoint=0;

    public Producto() {}

    public Producto(String nombre, EnumCategorias categoria, int stock) {

        this.codigo = Integer.toString(categoria.getCodigoD())+Integer.toString(++codigoint);
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EnumCategorias getCategoria() {
        return categoria;
    }

    public void setCategoria(EnumCategorias categoria) {
        this.categoria = categoria;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto: " +
                "nombre:" + nombre + '\'' +
                ", categoria:" + categoria +
                ", stock:" + stock +
                ", codigo:" + codigo +
                '}';
    }
}
