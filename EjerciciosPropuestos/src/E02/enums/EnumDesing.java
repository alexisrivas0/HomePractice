package E02.enums;

public enum EnumDesing {

    COLOREADO (1.15d),
    COLOR_FIRMA (1.20d),
    BASIC (1.0d);

    private double porcentaje;

    EnumDesing(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }
}
