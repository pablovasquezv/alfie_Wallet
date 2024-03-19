package com.vásquezSoftwareSolutions.alfie_wallet;

/**
 * @author Pablo
 */

import java.util.List;

/**
 * Clase: Usuario
 */
public class AlfieWallet implements IWallet {
    //Atributos
    private double saldo;

    private List<String> transacciones;

    /**
     * Constructor Vacío
     */
    public AlfieWallet() {
    }

    /**
     * Constructor con parámetros
     *
     * @param saldo
     * @param transacciones
     */
    public AlfieWallet(double saldo, List<String> transacciones) {
        this.saldo = saldo;
        this.transacciones = transacciones;
    }

    @Override
    public double obtenerSaldo() {
        return 0;
    }

    @Override
    public void despositar(double cantidad) {

    }

    @Override
    public boolean retirar(double cantidad) {
        return false;
    }

    @Override
    public boolean convetirMoneda(double cantida, String desdeMoneda, String aMoneda) {
        return false;
    }
}
