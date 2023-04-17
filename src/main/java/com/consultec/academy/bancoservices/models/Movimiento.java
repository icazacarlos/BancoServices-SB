package com.consultec.academy.bancoservices.models;

import java.time.LocalDateTime;

public class Movimiento {
    private final LocalDateTime fechaMovimiento;
    private final int iDCliente;
    private final String numeroCuenta;
    private final boolean statusMovimiento;
    private final String detalleStatus;
    private final double montoMovimiento;

    public Movimiento(LocalDateTime fechaMovimiento, int iDCliente, String numeroCuenta, boolean statusMovimiento, String detalleStatus, double montoMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
        this.iDCliente = iDCliente;
        this.numeroCuenta = numeroCuenta;
        this.statusMovimiento = statusMovimiento;
        this.detalleStatus = detalleStatus;
        this.montoMovimiento = montoMovimiento;
    }

    public LocalDateTime getFechaMovimiento() {
        return fechaMovimiento;
    }

    public int getiDCliente() {
        return iDCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public boolean isStatusMovimiento() {
        return statusMovimiento;
    }

    public String getDetalleStatus() {
        return detalleStatus;
    }

    public double getMontoMovimiento() {
        return montoMovimiento;
    }
}
