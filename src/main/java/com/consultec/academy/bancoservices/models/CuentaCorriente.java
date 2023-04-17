package com.consultec.academy.bancoservices.models;

import com.consultec.academy.bancoservices.models.abstracts.Cuenta;
import com.consultec.academy.bancoservices.models.cons.TipoCuentas;

public class CuentaCorriente extends Cuenta {
    public CuentaCorriente(double balance) {
        super(TipoCuentas.CC.getIdTypecuenta(), balance);
    }
}
