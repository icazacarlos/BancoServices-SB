package org.academia.consultec.dia4.constantes;

public enum Tasas {
    MANT(1.24,"Tasa Mantenimiento"),
    INT(1.24, "Tasa de Interes");

    double montoFijo;
    String descripcion;

    Tasas(double montoFijo, String descripcion) {
        this.descripcion = descripcion;
        this.montoFijo = montoFijo;
    }

    public double getMontoFijo() {
        return montoFijo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
