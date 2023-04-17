package com.consultec.academy.bancoservices.models;

import com.consultec.academy.bancoservices.models.abstracts.Cuenta;
import com.consultec.academy.bancoservices.models.cons.TipoCuentas;

public class CuentaPlazoFijo extends Cuenta {
    public CuentaPlazoFijo(double balance) {
        super(TipoCuentas.CP.getIdTypecuenta(), balance);
    }
}
