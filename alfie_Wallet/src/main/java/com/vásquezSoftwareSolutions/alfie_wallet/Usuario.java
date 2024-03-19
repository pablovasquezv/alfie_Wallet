package com.vásquezSoftwareSolutions.alfie_wallet;

/**
 * @author Pablo
 */

/**
 * Clase: Usuario
 */
public class Usuario {
    //Atributos
    private int id;
    private String nombre;
    private AlfieWallet wallet;

    /**
     * Constructor Vacío
     */
    public Usuario() {
    }

    /**
     * Constructor con parámetros
     *
     * @param id
     * @param nombre
     * @param wallet
     */
    public Usuario(int id, String nombre, AlfieWallet wallet) {
        this.id = id;
        this.nombre = nombre;
        this.wallet = wallet;
    }
}
