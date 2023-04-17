package com.consultec.academy.bancoservices.models.abstracts;

import com.consultec.academy.bancoservices.models.cons.TipoCuentas;

import java.io.Serializable;
import java.util.UUID;

public class Cuenta implements Serializable {
    private String numeroCuenta;
    private int tipoCuenta;
    private double balance;

    public Cuenta(int tipoCuenta, double balance) {
        this.numeroCuenta = UUID.randomUUID().toString();
        this.tipoCuenta = tipoCuenta;
        this.balance = balance;
    }

    public Cuenta() {
        this.numeroCuenta = UUID.randomUUID().toString();
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(int tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Cuenta [numeroCuenta=" + numeroCuenta + ", tipoCuenta=" + tipoCuenta + ", balance=" + balance + "]";
    }

}
