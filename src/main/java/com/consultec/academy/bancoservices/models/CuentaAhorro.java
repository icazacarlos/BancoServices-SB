package com.consultec.academy.bancoservices.models;

import com.consultec.academy.bancoservices.models.abstracts.Cuenta;
import com.consultec.academy.bancoservices.models.cons.TipoCuentas;

public class CuentaAhorro extends Cuenta {
    public CuentaAhorro(double balance) {
        super(TipoCuentas.CA.getIdTypecuenta(), balance);
    }
}
