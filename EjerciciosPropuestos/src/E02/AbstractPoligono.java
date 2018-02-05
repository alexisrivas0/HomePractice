package E02;


import E02.enums.EnumDesing;
import E02.enums.EnumMateriales;

public abstract class AbstractPoligono implements IPoligono {


    private EnumMateriales material;
    private double precio;
    private EnumDesing desing;
    private double porcentaje;

    public AbstractPoligono(EnumMateriales material, double precio, EnumDesing desing, double porcentaje) {
        this.material = material;
        this.precio = precio;
        this.desing = desing;
        this.porcentaje = porcentaje;
    }

    public EnumMateriales getMaterial() {
        return material;
    }

    public void setMaterial(EnumMateriales material) {
        this.material = material;
    }

    public double getPrecio() {
        return precio;
    }


    public EnumDesing getDesing() {
        return desing;
    }

    public void setDesing(EnumDesing desing) {
        this.desing = desing;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public void setPrecio() {
        this.precio=precio*porcentaje;
        
    }
}
