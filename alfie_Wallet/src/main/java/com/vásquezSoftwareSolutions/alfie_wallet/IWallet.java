package com.vásquezSoftwareSolutions.alfie_wallet;

/**
 * @author Pablo
 */

/**
 * Interface: IWallet
 */
public interface IWallet {
    //Métodos
    double obtenerSaldo();

    void despositar(double cantidad);

    boolean retirar(double cantidad);

    boolean convetirMoneda(double cantida, String desdeMoneda, String aMoneda);
}
