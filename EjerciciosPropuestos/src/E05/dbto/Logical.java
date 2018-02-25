package E05.dbto;

import E05.enums.EnumCategorias;

import java.util.ArrayList;
import java.util.Scanner;

public class Logical {

    ArrayList<Producto> productolist = new ArrayList<>();

    public void NuevoProducto() {

        Producto product = new Producto();
        Scanner inte = new Scanner(System.in);
        Scanner Strin = new Scanner(System.in);

        System.out.println("Escribe el nombre del porducto: ");

        String name = Strin.nextLine();
        product.setNombre(name);

        System.out.println("Elige la categoría de tu producto: ");
        for (EnumCategorias categorias: EnumCategorias.values()) {
            System.out.println(categorias+" "+categorias.getCodigoD());}

        int a = inte.nextInt();
        switch (a) {

            case 1: product.setCategoria(EnumCategorias.CARNES);
                break;
            case 2: product.setCategoria(EnumCategorias.FRUTAS_Y_VERDURAS);
                break;
            case 3: product.setCategoria(EnumCategorias.GRANOS);
                break;
            case 4: product.setCategoria(EnumCategorias.LICORES);
                break;
            case 5: product.setCategoria(EnumCategorias.MANUFACTURADOS);
                break;
        }

        System.out.println("¿Cuantas unidades hay en stock? ");
        int stockage = inte.nextInt();
        product.setStock(stockage);

        System.out.println("Categoria: "+product.getCategoria()+" Nombre: "+product.getNombre()+" Stock"+
        product.getStock());

        productolist.add(product);
    }

    public void EliminarProducto(){

        Scanner inte = new Scanner(System.in);
        System.out.println("Elige el producto que desea eleiminar: ");
        ProductosDiponibles();
        int eleccion = inte.nextInt();
        productolist.remove(eleccion);
        System.out.println("Tu producto ha sido elimando satisfactoriamente ");
    }

    public void ProductosDiponibles(){

        System.out.println("Dispones de los siguientes productos: ");

        for(Producto producto: productolist){

            int numero = 0;
            System.out.println(producto.getNombre()+numero++);
        }
    }

    public void ConsularStock(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Elige cual producto desea consultar: ");
        ProductosDiponibles();
        int opc = sc.nextInt();
        System.out.println("Su producto: "+ productolist.get(opc).getNombre()+" cuenta con: "+
                productolist.get(opc).getStock()+" unidades en Stock");
    }
    public void StockMenorA(){

        System.out.println("Los productos que tienen un stock menor a 5 son: ");
        for (Producto produ: productolist) {

            if(produ.getStock()<5){
                System.out.println(produ.getNombre());
            }
        }
    }



}
