package com.vásquezSoftwareSolutions.alfie_wallet;

/**
 * @author Pablo
 */

/**
 * Interface: IWallet
 */
public interface IWallet {
    //Atributos
    double obtenerSaldo();

    void despositar(double cantidad);

    boolean retira(double cantidad);

    boolean convetirMoneda(double cantida, String desdeMoneda, String aMoneda);
}
