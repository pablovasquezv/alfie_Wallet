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

    void desposita(double cantidad);

    boolean retira(double cantidad);

    boolean convetirMoneda(double cantida, String desdeMoneda, String aMoneda);
}
