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

    /**
     *
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     *
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * @return transacciones
     */
    public List<String> getTransacciones() {
        return transacciones;
    }

    /**
     *
     * @param transacciones
     */
    public void setTransacciones(List<String> transacciones) {
        this.transacciones = transacciones;
    }

    /**
     *
     * @return saldo
     */
    @Override
    public double obtenerSaldo() {
        return saldo;
    }

    @Override
    public void despositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Se ha depositado: " + cantidad + " de dinero en la cuenta!");
        System.out.println("El saldo actual es: " + saldo);

    }

    @Override
    public boolean retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se ha retirado la cantidad " + cantidad + " de dinero de la cuenta!");
            System.out.println("El saldo actual es: " + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro");
            return false;
        }
    }

    @Override
    public boolean convetirMoneda(double cantidad, String desdeMoneda, String aMoneda) {
        return false;
    }
}
