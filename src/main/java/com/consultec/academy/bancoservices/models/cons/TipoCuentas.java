package com.consultec.academy.bancoservices.models.cons;

public enum TipoCuentas {
    CA(1, "Cuenta Ahorro"),
    CC(2, "Cuenta Corriente"),
    CP(3, "Cuenta a Plazo Fijo");

    int idTypecuenta;
    String descripcionCuenta;


    TipoCuentas(int idTypecuenta, String descripcionCuenta) {
        this.idTypecuenta = idTypecuenta;
        this.descripcionCuenta = descripcionCuenta;
    }


    public int getIdTypecuenta() {
        return idTypecuenta;
    }

    public String getDescripcionCuenta() {
        return descripcionCuenta;
    }

    public static TipoCuentas loadEnum(int tipoenum){
        TipoCuentas tipoCuentas = null;
        switch (tipoenum){
            case 1 -> tipoCuentas = TipoCuentas.CA;
            case 2 -> tipoCuentas = TipoCuentas.CC;
            case 3 -> tipoCuentas = TipoCuentas.CP;
        }
        return tipoCuentas;
    }
}
