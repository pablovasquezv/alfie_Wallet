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

    /**
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return wallet
     */
    public AlfieWallet getWallet() {
        return wallet;
    }

    /**
     * @param wallet
     */
    public void setWallet(AlfieWallet wallet) {
        this.wallet = wallet;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", wallet=" + wallet +
                '}';
    }
}
